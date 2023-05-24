package com.example.rabbitmq.rabbitmqProducer.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    public String index(){
        return "Do tien dat";
    }

}
