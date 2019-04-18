package hello.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication(scanBasePackages = ["hello"])
@PropertySource("classpath:config-application.properties")
open class TestMain

fun main(args: Array<String>) {
    SpringApplication.run(TestMain::class.java, *args)
}