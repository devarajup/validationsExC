package com.cjss.validations.rest;

//import com.cjss.validations.exception.StudentNotFoundException;
import com.cjss.validations.model.Student;
import com.cjss.validations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentRest {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public void addStudent(@Valid @RequestBody Student student){

    service.addStudent(student);
    }
    @GetMapping("/get/{id}")
    public  Student get(@PathVariable Integer id){

        return  service.getStudents(id);

    }
}
