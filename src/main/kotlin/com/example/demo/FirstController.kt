package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

@Controller
class FirstController {

    @GetMapping("/")
    fun welcomeMain(): Mono<String> = "main".toMono()
}