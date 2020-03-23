package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.InputNumber;
import com.example.demo.model.Result;
import com.example.demo.services.DemoService;

@RestController
@RequestMapping("/api")
public class Calculator {
	
	@Autowired
	private DemoService demoService;
	
	@PostMapping(value = "/sum",consumes = "application/json", produces = "application/json")
	public Result sum(@RequestBody InputNumber number) {
		return demoService.add(number.getX(),number.getY());
	}
	
	@GetMapping("/test")
	public String getmessage() {
		return "tested";
	}
}
