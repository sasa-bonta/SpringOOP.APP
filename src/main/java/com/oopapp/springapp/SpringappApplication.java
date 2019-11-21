package com.oopapp.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
//@RequestMapping
@SpringBootApplication
public class SpringappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringappApplication.class, args);
        StudentsWeb store = new StudentsWeb();
        //System.out.println(store.getName());
    }

}
