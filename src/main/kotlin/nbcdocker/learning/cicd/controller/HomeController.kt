package nbcdocker.learning.cicd.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun home(): String {
        return "home"
    }

    @GetMapping("/healthz")
    fun healthz(): String {
        return "healthz"
    }
}