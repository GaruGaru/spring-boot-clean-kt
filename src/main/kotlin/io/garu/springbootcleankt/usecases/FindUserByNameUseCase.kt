package io.garu.springbootcleankt.usecases

import io.garu.springbootcleankt.arch.UseCase
import io.garu.springbootcleankt.models.User
import io.garu.springbootcleankt.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class FindUserByNameUseCase(private val userRepository: UserRepository) : UseCase<String, User?> {
    override fun execute(param: String): User? = this.userRepository.getAllUsers().firstOrNull { it.name == param }
}
