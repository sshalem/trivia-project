package com.trivia.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

	@GetMapping("/index")
	public String index() {
		return "index.html";
	}
}
