package com.oopapp.springapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/control")
public class GoodWebService {

    @GetMapping("/exam")
    public String getName() {
        return "test";
    }

    @GetMapping("/children")
    public List<String> children(){
        return List.of("Jorika", "Zinaida", "Sirgi", "Slavik", "Andrusa", "Viorica", "Aliona", "Agafia");
    }

    List<String> childrenfi181 = new ArrayList<String>();

    @PostMapping("/addname/{name}")
    public List<String> addname(@PathVariable("name") String name){

        childrenfi181.add("Jorica");
        childrenfi181.add("Zinaida");
        childrenfi181.add("Sirghi");
        childrenfi181.add("Slavik");
        childrenfi181.add("Andrusa");
        childrenfi181.add("Viorica");
        childrenfi181.add("Aliona");
        childrenfi181.add("Agafia");
        childrenfi181.add(name);

        childrenfi181.forEach(System.out::println);
        return (childrenfi181);
    }

    @GetMapping("/all")
    public List<String> childrenfi181(){
        return (childrenfi181);
    }
}
