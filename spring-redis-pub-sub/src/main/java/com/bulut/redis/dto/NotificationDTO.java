package com.bulut.redis.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :15:49
 * Day: Thursday
 * Month:January
 * Year:2022
 */
@Data
public class NotificationDTO implements Serializable {

    private int id;
    private String message;

}
