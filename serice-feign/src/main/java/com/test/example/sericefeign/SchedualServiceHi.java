package com.test.example.sericefeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client1", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping("client1")
    String sayHiFromClientOne(@RequestParam("name") String name);

}
