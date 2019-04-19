package hello.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = ["hello"])
open class CoreApplication

fun main(args: Array<String>) {
    SpringApplication.run(CoreApplication::class.java, *args)
}