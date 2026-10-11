package com.telusko.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlienController {

    @PostMapping("add-alien")
    public String alienController(@RequestBody Alien alien){
        return "Successfully received alien: " + alien.getAname() + " from " + alien.getAlang();

    }

    @GetMapping("add-alien")
    public Alien alienObjController(@RequestBody Alien alien){
        System.out.println( "Successfully received alien: " + alien.getAname() + " from " + alien.getAlang());
        return alien;

    }
}
