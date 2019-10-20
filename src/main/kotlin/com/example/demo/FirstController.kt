package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

@RestController
class FirstController {

    @GetMapping("/")
    fun welcomeMain(): Mono<String> = "hello webflux".toMono()
}