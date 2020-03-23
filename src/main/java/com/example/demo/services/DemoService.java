package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.model.Result;

@Service
public class DemoService {

	public Result add(int x, int y) {
		int sum = x + y;
		return new Result(sum);
	}
}
