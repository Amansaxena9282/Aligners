package com.practice.Aligners.controller;

import com.practice.Aligners.model.System;
import com.practice.Aligners.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class TestController {

    @Autowired
    private TestService testService;
    @GetMapping("/aarav")
    public List<System> get(){
//        return (List<System>) testService.getAll();
    return testService.getAll();

}
    @GetMapping("/aman")
    public String getaman(){
        System system= new System();
        system.setName("Aman");
        system.setAge(22);
        return system.toString();
    }
    @GetMapping("/ex/{id}/data")
    public String getData(@PathVariable(value = "id") int id){
        return String.valueOf(id);
    }
    @GetMapping("/ex1/{mobile_no}/data")
    public String getData1(@PathVariable int mobile_no){
        return String.valueOf(mobile_no);
    }
    @GetMapping("/ex2/{age}/data")
    public System getSystemdetails(@PathVariable int age, @RequestParam String name,@RequestParam int
            id){
        System system=new System(name,age,id);
        return system;
    }
    //Post
    @PostMapping("/add")
    public System addSystem(@RequestBody System system){
        return testService.getSystem(system);

    }

    //Put
    @PutMapping("/update")
    public System update(@RequestBody System system){
        return testService.update(system);

    }
    @DeleteMapping("/Delete/{id}")
    public String deleteData(@PathVariable int id){
        return testService.delete(id);
    }

}


