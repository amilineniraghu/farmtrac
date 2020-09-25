package com.farmtrac.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestContoller{

	@GetMapping("/getList")
	public String testGetMethod(Map map) {
		System.out.println("getList request is called");
		return "test";
	}
}
