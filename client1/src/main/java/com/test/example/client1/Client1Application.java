package com.test.example.client1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class Client1Application {

    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }

    @Value("${server.port}")
    String port;
    @GetMapping("/client1")
    public String home(@RequestParam String name) {
        return "client1 "+name+",i am from port:" +port;
    }

}

