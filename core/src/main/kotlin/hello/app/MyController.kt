package hello.app

import hello.service.MyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(private val myService: MyService) {
    @GetMapping("/")
    fun home(): String {
        return myService.message()
    }
}