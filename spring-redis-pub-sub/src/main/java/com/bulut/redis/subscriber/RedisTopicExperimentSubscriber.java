package com.bulut.redis.subscriber;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :15:36
 * Day: Thursday
 * Month:January
 * Year:2022
 */
@Component
public class RedisTopicExperimentSubscriber implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println(message.toString());
    }
}
