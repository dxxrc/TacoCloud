package com.example.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        // 返回视图名
        System.out.println("okkkkkkkkkkkkkkkkkk");
        return "home";
    }
}
