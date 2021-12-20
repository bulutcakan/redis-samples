package com.bulut.redis.service;

import com.bulut.redis.model.Student;

import java.util.List;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :00:00
 * Day: Tuesday
 * Month:December
 * Year:2021
 */
public interface StudentService {

    void save(Student student);

    List<Student> getAll();

    Student findById(String id);

    void deleteById(String id);

    void update(String id, Student student);


}
