package com.example.mongo.mongoapi.controller;

import com.example.mongo.mongoapi.model.Student;
import com.example.mongo.mongoapi.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/addstudent")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student savedStudent = this.studentRepo.save(student);
//        return new ResponseEntity<>(savedStudent,HttpStatus.CREATED);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping("/getallstudents")
    public ResponseEntity<?> getStudents(){
        List<Student> allStudent = this.studentRepo.findAll();
        return new ResponseEntity<>(allStudent,HttpStatus.FOUND);
    }
}
