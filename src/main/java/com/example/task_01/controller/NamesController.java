package com.example.task_01.controller;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")

public class NamesController {

//     GET request
//    @GetMapping
//    public String greeting(@RequestParam(name = "name", required = false) String name){
//        if(name == null || name.isEmpty()){
//            return "Good afternoon!";
//        } else {
//            return String.format("Good afternoon %s!", name);
//        }
//    }
//
//    // POJO
//    @GetMapping
//    public Greeting greeting(){
//        Greeting greeting = new Greeting("Faith", "afternoon");
//        return greeting;
//    }

//    // GET request
//    @GetMapping
//    public String timeOfDay(@RequestParam String timeOfDay){
//        return timeOfDay;
//    }

    // GET REQUEST
    @GetMapping(value = "/summer")
    public Celebration celebration(){
        Celebration celebration = new Celebration("Happy summer solstice!");
        return celebration;
    }

}
