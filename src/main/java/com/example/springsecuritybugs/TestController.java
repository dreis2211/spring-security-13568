package com.example.springsecuritybugs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test1")
	String test1() {
		return "test1";
	}

}
