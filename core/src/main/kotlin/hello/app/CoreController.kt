package hello.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CoreController(
    private val coreService: CoreService
) {

    @GetMapping("/")
    fun coreLog(): String {
        return coreService.myLog()
    }
}