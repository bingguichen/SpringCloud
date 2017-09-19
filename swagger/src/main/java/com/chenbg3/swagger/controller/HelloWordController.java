package com.chenbg3.swagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @ApiOperation(value = "hello", notes = "")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String hello() {
        return "Hello";
    }
}
