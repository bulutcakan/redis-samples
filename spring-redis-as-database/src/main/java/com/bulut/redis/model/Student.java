package com.bulut.redis.model;

import com.bulut.redis.enums.Gender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :00:13
 * Day: Tuesday
 * Month:December
 * Year:2021
 */
@RedisHash("Student")
@Data
public class Student implements Serializable {
    @Id
    String id;
    private String name;
    private Gender gender;
    private int grade;

}
