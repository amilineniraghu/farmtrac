package com.farmtrac.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestContoller{
	 private static final Logger logger = LogManager.getLogger(TestContoller.class);
	@GetMapping("/getList")
	public String testGetMethod() {
		logger.info("getList request is called");
		return "test";
	}
}
