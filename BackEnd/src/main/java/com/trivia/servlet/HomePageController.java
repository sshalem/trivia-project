package com.trivia.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("*")
public class HomePageController {

	@GetMapping("/index")
	public String index() {
		return "index.html";
	}
	
	@GetMapping("/אוכל")
	public String food() {
		return "אוכל.html";
	}
}
