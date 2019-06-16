package com.vacilo.forum.controller.status

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("status")
@Api(value = "Status", description = "Api para verificar status do servidor", tags = arrayOf("Status API"))
class StatusController {

    @GetMapping
    @ApiOperation(value = "Retorna o status da aplicação", response = String::class)
    @ApiResponses(
            value = *arrayOf(
                    ApiResponse(code = 200, message = "OK"),
                    ApiResponse(code = 401, message = "You are not authorized access the resource"),
                    ApiResponse(code = 404, message = "The resource not found")
            )
    )
    fun status(): String {
        return "Ok"
    }

}