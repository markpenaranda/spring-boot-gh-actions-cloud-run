package com.markpenaranda.springbootcloudrun.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun test(): ResponseEntity<String> {
        return ResponseEntity.ok().body("Test OK")
    }
}
