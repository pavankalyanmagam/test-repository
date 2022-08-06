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
	@GetMapping("/test3")
	public String retunResponse3() {
		return  " This is Test Method";
	}
	
	@GetMapping("/test4")
	public String retunResponse4() {
		return  " This is Test Method";
	}
	
	@GetMapping("/test5")
	public String retunResponse5() {
		return  " This is Test Method";
	}
	
	

}
