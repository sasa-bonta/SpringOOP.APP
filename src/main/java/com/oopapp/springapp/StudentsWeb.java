package com.oopapp.springapp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/control")
public class StudentsWeb {

    Childrenfi181 childrenfi181 = new Childrenfi181();

    @PostMapping("/addname/{name}")
    public List<String> addname(@PathVariable("name") String name){

        childrenfi181.childrenfi181.add(name);
//                .stream()
//                .filter((children) -> children.contains("A"))
//                .limit(3)
//                .map((children) -> children + " Test")
        childrenfi181.childrenfi181.forEach(System.out::println);
        return (childrenfi181.childrenfi181);
    }


    @PutMapping("/addstudent")
    public List<String> getStudentName(@RequestParam String studentName) {
        childrenfi181.childrenfi181.add(studentName);
        return (childrenfi181.childrenfi181);
    }

    @GetMapping("/all")
    public List<String> childrenfi181(){
        return (childrenfi181.childrenfi181);
    }

    @DeleteMapping("/delName/{name}")
    public List<String> delName(@PathVariable("name") String name){
         childrenfi181.childrenfi181.remove(name);
         return (childrenfi181.childrenfi181);
    }
}
