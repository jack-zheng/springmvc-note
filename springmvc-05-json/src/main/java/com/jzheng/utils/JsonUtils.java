package com.jzheng.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Date;

public class JsonUtils {
    public static String getJson(Object oject, String dateFormate) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        try {
            return objectMapper.writeValueAsString(new Date());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
