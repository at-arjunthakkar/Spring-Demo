package com.programmer47.SpringbootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller {

    @GetMapping(value = "/")
    public String helloWorld(){
        return "Hello from Spring boot !!";
    }
}
