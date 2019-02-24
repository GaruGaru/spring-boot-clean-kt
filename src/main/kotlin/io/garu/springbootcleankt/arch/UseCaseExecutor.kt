package io.garu.springbootcleankt.arch

import org.springframework.stereotype.Service

@Service
class UseCaseExecutor {

    fun <IN, OUT, ADAPTED> execute(useCase: UseCase<IN, OUT>, param: IN, adapter: (OUT) -> ADAPTED): ADAPTED {
        return useCase.execute(param).let(adapter)
    }

    fun <IN, OUT> execute(useCase: UseCase<IN, OUT>, param: IN): OUT {
        return this.execute(useCase, param) { out -> out }
    }

    fun <OUT> execute(useCase: UseCase<Unit, OUT>): OUT {
        return this.execute(useCase, Unit)
    }

}