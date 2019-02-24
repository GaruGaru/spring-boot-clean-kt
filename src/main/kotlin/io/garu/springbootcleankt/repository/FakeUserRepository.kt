package io.garu.springbootcleankt.repository

import io.garu.springbootcleankt.models.User
import org.springframework.stereotype.Repository

@Repository
class FakeUserRepository : UserRepository {

    override fun getAllUsers(): List<User> = listOf(
            User("Mario", "Rossi"),
            User("Beppe", "Bepponzi", age = 23),
            User("Luigi", "Pannocchia", age = 27)
    )

}
