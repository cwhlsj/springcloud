package com.test.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/client1")
    public String hi(@RequestParam String name){
        return helloService.hiSerive(name);
    }
}
