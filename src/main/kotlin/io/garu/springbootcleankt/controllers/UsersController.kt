package io.garu.springbootcleankt.controllers

import io.garu.springbootcleankt.arch.UseCaseExecutor
import io.garu.springbootcleankt.models.User
import io.garu.springbootcleankt.usecases.FindAllUsersUseCase
import io.garu.springbootcleankt.usecases.FindUserByNameUseCase
import io.garu.springbootcleankt.usecases.SearchUserUseCase
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UsersController(
        private val useCaseExecutor: UseCaseExecutor,
        private val findAllUsersUseCase: FindAllUsersUseCase,
        private val findUserByNameUseCase: FindUserByNameUseCase,
        private val searchUserUseCase: SearchUserUseCase
) {

    @GetMapping("/")
    fun allUsers(): List<User> = useCaseExecutor.execute(
            useCase = findAllUsersUseCase
    )

    @GetMapping("/{name}")
    fun byName(@PathVariable name: String) = useCaseExecutor.execute(
            useCase = findUserByNameUseCase,
            param = name
    )

    @GetMapping("/search")
    fun search(@RequestParam("q") query: String) = useCaseExecutor.execute(
            useCase = searchUserUseCase,
            param = SearchUserUseCase.SearchUserRequest(query = query)
    )


}