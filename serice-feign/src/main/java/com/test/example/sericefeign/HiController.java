package com.test.example.sericefeign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {
    @Resource
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/client1")
    public String hi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
