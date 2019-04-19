package hello.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CliController(
    private val cliService: CliService
) {
    @GetMapping("/")
    fun cliLog(): String {
        return cliService.message()
    }
}