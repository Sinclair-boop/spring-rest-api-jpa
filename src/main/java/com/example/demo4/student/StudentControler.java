package com.example.demo4.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentControler {
    private final StudentService studentService;

    @Autowired
    public StudentControler(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudent(){
        return  studentService.getStudents();
    }
}
