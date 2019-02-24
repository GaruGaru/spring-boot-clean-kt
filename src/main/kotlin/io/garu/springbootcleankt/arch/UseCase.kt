package io.garu.springbootcleankt.arch

interface UseCase<in IN, out OUT> {
    fun execute(param: IN): OUT
}