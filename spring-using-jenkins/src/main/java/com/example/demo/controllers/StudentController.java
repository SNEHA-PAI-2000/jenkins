package com.example.demo.controllers;



import java.util.Arrays;
import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {



   @GetMapping
    public List<String> getNames(){
        
        return Arrays.asList("Ram","Shyam","sneha","kavya");
        
    }
    
}