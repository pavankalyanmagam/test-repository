package com.code.pavan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String retunResponse() {
		return  " This is Test Method";
	}
	
	@GetMapping("/test2")
	public String retunResponse2() {
		return  " This is Test Method";
	}

}
