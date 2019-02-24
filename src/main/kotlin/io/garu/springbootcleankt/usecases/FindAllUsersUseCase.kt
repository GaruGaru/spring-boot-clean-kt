package io.garu.springbootcleankt.usecases

import io.garu.springbootcleankt.arch.UseCase
import io.garu.springbootcleankt.models.User
import io.garu.springbootcleankt.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class FindAllUsersUseCase(val userRepository: UserRepository) : UseCase<Unit, List<User>> {

    override fun execute(param: Unit) = userRepository.getAllUsers()

}