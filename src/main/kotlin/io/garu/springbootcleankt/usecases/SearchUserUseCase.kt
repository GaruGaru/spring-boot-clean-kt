package io.garu.springbootcleankt.usecases

import io.garu.springbootcleankt.arch.UseCase
import io.garu.springbootcleankt.common.isContainedInAnyOf
import io.garu.springbootcleankt.models.User
import io.garu.springbootcleankt.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class SearchUserUseCase(private val repository: UserRepository) : UseCase<SearchUserUseCase.SearchUserRequest, List<User>> {

    override fun execute(param: SearchUserRequest) = repository
            .getAllUsers()
            .filter { param.query.isContainedInAnyOf(it.name, it.surname) }

    data class SearchUserRequest(val query: String)

}