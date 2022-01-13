package com.bulut.redis.controller;

import com.bulut.redis.dto.NotificationDTO;
import com.bulut.redis.dto.ProductDTO;
import com.bulut.redis.publisher.RedisNotificationMessagePublisher;
import com.bulut.redis.publisher.RedisProductMessagePublisher;
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


    private final RedisProductMessagePublisher redisMessagePublisher;
    private final RedisNotificationMessagePublisher notificationMessagePublisher;


    @PostMapping("/notification/publish")
    public String notificationPublish(@RequestBody NotificationDTO productDTO) {
        notificationMessagePublisher.publish(productDTO);
        return "Event published!!";
    }

    @PostMapping("/product/publish")
    public String productPublish(@RequestBody ProductDTO productDTO) {
        redisMessagePublisher.publish(productDTO);
        return "Event published!!";
    }


}
