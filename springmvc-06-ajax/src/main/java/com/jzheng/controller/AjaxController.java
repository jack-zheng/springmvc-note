package com.jzheng.controller;

import com.jzheng.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name,HttpServletResponse response) throws IOException {
        System.out.println("a1"+name);
        if ("1".equals(name)){
            response.getWriter().print(true);
        }else {
            response.getWriter().print(false);
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() throws IOException {
        return Arrays.asList(new User("a", 1, "m"), new User("b", 2, "f"));
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) throws IOException {
        if (name != null) {
            if ("admin".equals(name)) {
                return "ok";
            } else {
                return "false";
            }
        }

        if (pwd != null) {
            if ("pwd".equals(pwd)) {
                return "ok";
            } else {
                return "false";
            }
        }
        return "false";
    }
}
