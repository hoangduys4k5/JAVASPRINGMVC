package edu.phuxuan.k17.spring.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.phuxuan.k17.mvcdemo.model.User;
@Controller
public class myHomeController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    @RequestMapping("/hello")
    public String hello(Model model) {
        User user = new User();
        user.setFullName("Hoàng Duy");
        model.addAttribute("myuser", user);
        return "hello";

    }

}