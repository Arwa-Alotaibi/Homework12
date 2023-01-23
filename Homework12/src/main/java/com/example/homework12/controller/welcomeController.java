package com.example.homework12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    //GET /name : returns “My name is .......”
    @GetMapping("/name")
    public String GetName(){
        return "My name is Arwa :)";
    }
    //GET /age : returns “My age is ........”
    @GetMapping("/age")
    public String GetAge(){
        return "My age is 23";
    }
    //GET /check/status : returns “Everything OK”
    @GetMapping("/check/status")
    public String check_status(){
        return "Everything OK :)";
    }
   // GET /health : returns “Server health is up and running”
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
}
