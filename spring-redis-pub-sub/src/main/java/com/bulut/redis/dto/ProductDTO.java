package com.bulut.redis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :20:33
 * Day: Wednesday
 * Month:January
 * Year:2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {
    private int id;
    private String name;
    private int qty;
    private long price;
}
