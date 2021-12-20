package com.bulut.redis.controller;

import com.bulut.redis.model.Student;
import com.bulut.redis.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :00:14
 * Day: Tuesday
 * Month:December
 * Year:2021
 */
@RestController
@RequestMapping("/api/v1/redis")
@RequiredArgsConstructor
public class RedisDatabaseController {
    private final StudentService studentService;

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") String id) {
        return new ResponseEntity(studentService.findById(id), HttpStatus.ACCEPTED);
    }

    @PostMapping("/student")
    public ResponseEntity saveStudent(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity deleteStudentById(@PathVariable("id") String id) {
        studentService.deleteById(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity(studentService.getAll(), HttpStatus.ACCEPTED);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity updateStudent(@PathVariable("id") String id, @RequestBody Student student) {
        studentService.update(id, student);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
