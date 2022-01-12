package com.bulut.redis.controller;

import com.bulut.redis.dto.ProductDTO;
import com.bulut.redis.publisher.RedisMessagePublisher;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :02:57
 * Day: Tuesday
 * Month:December
 * Year:2021
 */
@RestController
@AllArgsConstructor
public class RedisMessageController {


    private final RedisMessagePublisher redisMessagePublisher;

    @PostMapping("/publish")
    public String publish(@RequestBody ProductDTO productDTO) {
        redisMessagePublisher.publish(productDTO);
        return "Event published!!";
    }


}
