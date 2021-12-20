package com.bulut.redis.repository;

import com.bulut.redis.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :00:54
 * Day: Tuesday
 * Month:December
 * Year:2021
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
