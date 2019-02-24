package io.garu.springbootcleankt.common

fun String.containsIgnoringCase(test: String): Boolean = this.toLowerCase().contains(test.toLowerCase())

fun String.containsAnyOf(vararg values: String): Boolean = values.any { this.containsIgnoringCase(it) }

fun String.isContainedInAnyOf(vararg values: String): Boolean = values.any { it.containsIgnoringCase(this) }