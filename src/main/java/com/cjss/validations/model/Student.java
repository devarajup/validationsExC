package com.cjss.validations.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Student {
//    @NotNull(message = "it is not null")
    private Integer id;
//    @NotNull(message = "it is not null -name")
//    @NotEmpty(message = "it is not empty -name")
    private String name;
//    @NotEmpty(message = "it is not empty")
//    @Email
    private  String email;
//    @NotNull
    private  String course;
//    @NotEmpty
    private  String collegeName;

    public Student(Integer id, String name, String email, String course, String collegeName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.collegeName = collegeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
