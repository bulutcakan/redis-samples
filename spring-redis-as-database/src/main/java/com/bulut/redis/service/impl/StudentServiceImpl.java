package com.bulut.redis.service.impl;

import com.bulut.redis.model.Student;
import com.bulut.redis.repository.StudentRepository;
import com.bulut.redis.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :00:04
 * Day: Tuesday
 * Month:December
 * Year:2021
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    @Override
    public Student findById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(String id) {
        Student byId = findById(id);
        if (null != byId) {
            studentRepository.delete(byId);
        }
    }

    @Override
    public void update(String id, Student student) {
        Student byId = findById(id);
        if (null != byId) {
            byId.setGender(student.getGender());
            byId.setName(student.getName());
            byId.setGrade(student.getGrade());
        }
        assert byId != null;
        studentRepository.save(byId);
    }
}
