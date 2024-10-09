package com.example.tomcat.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tomcat")
class TestController {
    @GetMapping("/hi")
    fun sayHi():String{
        return "hello tomcat"
    }
}