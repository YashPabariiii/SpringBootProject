package com.SpringBootProject.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class hellocontroller {
    @RequestMapping(value = "/",method = RequestMethod.GET)
public String helloworld(){
        return "Welcome!!!";
    }
    @GetMapping("/1")
    public String helloworld1(){
        return "Welcome Again!!";
    }
}
//https://youtu.be/zvR-Oif_nxg?si=CjNRyaVzeJJAJA3W&t=7193