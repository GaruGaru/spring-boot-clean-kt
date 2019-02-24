package io.garu.springbootcleankt.repository

import io.garu.springbootcleankt.models.User

interface UserRepository {
    fun getAllUsers(): List<User>
}