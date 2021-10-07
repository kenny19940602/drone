package com.gogs.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {


    @RequestMapping(value = "/demo/{path}",method = RequestMethod.GET)
    public String demo(@PathVariable String path) {
        return "kenny"+path;
    }
}
