package com.telus.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")

public class RenderTestController {
	
	
	@GetMapping("/render")
	public String renderTest() {
		return "render success fully deployed";
	}

}
