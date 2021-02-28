package com.farmtrac.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmtrac.api.commons.utils.ResponseUtils;
import com.farmtrac.domain.Test;

@RestController
@RequestMapping("/api")
public class TestContoller{
	 private static final Logger logger = LogManager.getLogger(TestContoller.class);
	@GetMapping("/getList")
	public ResponseEntity<Object> testGetMethod(@RequestParam(value = "name") String name) {
		logger.info("getList request is called" + name);
		Test obj = new  Test();
		obj.setId(1);
		obj.setName("raghu");
		return ResponseUtils.buildSucessResponse(obj);
	}
}
