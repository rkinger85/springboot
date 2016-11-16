package com.gnb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shiva on 16/11/16. Added to git
 */
@RestController
@EnableAutoConfiguration
public class FirstApp {

  @RequestMapping("/")
public String home(){
    return "Hello World !";
}

    public static void main(String[] args) {
        SpringApplication.run(FirstApp.class,args);
    }

}
