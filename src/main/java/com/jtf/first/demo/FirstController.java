package com.jtf.first.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping("/test")
	public String getMessage(Model model) {
		return "index.html";
	}
}
