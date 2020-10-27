package com.jzheng.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jzheng.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

//@RestController 不走视图解析器 和 ResponseBody 二选一
@Controller
public class UserController {

    @RequestMapping("/j1")
    @ResponseBody // 不走视图解析器，直接返回字符串
    public String json1() throws JsonProcessingException {
        // jackson - ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // 创建一个对象
        User user = new User("杰克", 1, "man");

        String ret = objectMapper.writeValueAsString(user);
        return ret;
    }

    @RequestMapping("/j2") // 集合
    @ResponseBody // 不走视图解析器，直接返回字符串
    public String json2() throws JsonProcessingException {
        // jackson - ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // 创建一个对象
        User user = new User("杰克", 1, "man");

        String ret = objectMapper.writeValueAsString(Arrays.asList(user, user));
        return ret;
    }

    @RequestMapping("/j3") // 时间
    @ResponseBody // 不走视图解析器，直接返回字符串
    public String json3() throws JsonProcessingException {
        // jackson - ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        return objectMapper.writeValueAsString(new Date());
    }
}
