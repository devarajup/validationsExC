package com.cjss.validations.service;

import com.cjss.validations.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {
    Map<Integer, Student> studentMap = new HashMap<>();

    public  void addStudent( Student student){
        studentMap.put(student.getId(),student);
    }

    public Student getStudents(Integer id){

        return  studentMap.get(id);
    }
}
