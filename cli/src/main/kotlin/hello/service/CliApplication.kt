package hello.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = ["hello"])
open class CliApplication

fun main(args: Array<String>) {
    SpringApplication.run(CliApplication::class.java, *args)
}