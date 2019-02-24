package io.garu.springbootcleankt.models

data class User(
        val name: String,
        val surname: String,
        val age: Int? = null
)