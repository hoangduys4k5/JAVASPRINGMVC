package edu.phuxuan.k17.spring.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class myHomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
}
