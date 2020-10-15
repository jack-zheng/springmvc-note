package com.jzheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestfulController {
    // URL: /add?a=1&b=1
    // @RequestMapping("/add")
    // /add/a/b
    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.POST)
    public String test(@PathVariable int a, @PathVariable int b, Model model) {
        int ret = a + b;
        model.addAttribute("msg", "result=" + ret);
        return "test";
    }

    @GetMapping(value = "/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int ret = a + b;
        model.addAttribute("msg", "result=" + ret);
        return "test";
    }
}
