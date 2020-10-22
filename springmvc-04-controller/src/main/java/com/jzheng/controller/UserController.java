package com.jzheng.controller;

import com.jzheng.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    // localhost:8080/t1?name=jack
    @GetMapping("/t1")
    public String test(@RequestParam("username") String name, Model model) {
        // 1. 接收前端参数
        System.out.println("Received params: " + name);
        // 2. 返回传递结果
        model.addAttribute("msg", name);
        // 3. 视图调转
        return "test";
    }

    // http://localhost:8080/t2?username=jack&id=jjjj&age=3
    // 终端能打印出对象
    @GetMapping("/t2")
    public String complexType(User user) {
        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    public String test3(ModelMap map) {
        
        return "test";
    }
}
