package com.test.sbootproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Studentcontroller {
    @RequestMapping("/test")
    public String display(Model model) {
        return "/views/index";
    }
    @RequestMapping("/")
        public String test(Model model){
            return "/views/index";
        }

    @RequestMapping("/hello1")
    public String helloMethod(Model model){
        return "/views/hello";
    }
}