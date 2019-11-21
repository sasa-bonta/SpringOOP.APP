package com.oopapp.springapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stud")
public class StudentInfoWeb {
    private Object StudentInfo;

    @PostMapping
    public String getStudInfo(@RequestBody StudentInfo studentInfo){
        return studentInfo.toString();
    }
}
