package hello.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication(scanBasePackages = ["hello"])
class CliApplication: SpringBootServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(CliApplication::class.java)
    }
}

//fun main(args: Array<String>) {
//    SpringApplication.run(CliApplication::class.java, *args)
//}