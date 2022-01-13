package com.bulut.redis.publisher;

import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :15:58
 * Day: Thursday
 * Month:January
 * Year:2022
 */
@Service
@AllArgsConstructor
public class RedisNotificationMessagePublisher implements MessagePublisher{

    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public void publish(Object notificationDTO) {
        redisTemplate.convertAndSend("pubsub:bulut-experiment", notificationDTO);
    }
}
