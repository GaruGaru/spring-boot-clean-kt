package io.garu.springbootcleankt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["io.garu.springbootcleankt"])
class SpringBootCleanKtApplication

fun main(args: Array<String>) {
    runApplication<SpringBootCleanKtApplication>(*args) {
        setLogStartupInfo(true)
    }
}
