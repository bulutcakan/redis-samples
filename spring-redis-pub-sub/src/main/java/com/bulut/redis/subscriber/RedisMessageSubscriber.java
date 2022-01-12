package com.bulut.redis.subscriber;

import com.bulut.redis.dto.ProductDTO;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :02:02
 * Day: Tuesday
 * Month:December
 * Year:2021
 */
public class RedisMessageSubscriber implements MessageListener {

    public static List<String> messageList = new ArrayList<String>();

    @SneakyThrows
    public void onMessage(Message message, byte[] pattern) {
        messageList.add(message.toString());
        JsonFactory factory = new JsonFactory();
        factory.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        ObjectMapper mapper = new ObjectMapper(factory);
        ProductDTO productDTO = mapper.reader().forType(ProductDTO.class).readValue(message.toString());
        System.out.println("Message received: " + productDTO.toString());
    }
}
