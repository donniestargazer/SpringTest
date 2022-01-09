package com.tutorial.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
public class userController {
    //Day 6 Spring Boot -Controller(上)
    @RequestMapping("/MyFirstPage")
    public String greeting(@RequestParam(value="title", required=false, defaultValue="鐵人賽 加油!") String title, Model model) {
        model.addAttribute("name", title);
        return "index";
    }
}
