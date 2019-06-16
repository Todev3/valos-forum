package com.vacilo.forum.controller.status

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("status")
class StatusController {

    @GetMapping
    fun status(): String {
        return "Ok";
    }

}