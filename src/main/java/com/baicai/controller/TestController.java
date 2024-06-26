package com.baicai.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baicai.config.ApiResponse;
import com.baicai.dto.TestResponse;

@RestController
public class TestController {

	final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping(value = "/api/test")
	public ApiResponse get() {
		TestResponse res = new TestResponse(1L, "名称", LocalDateTime.now());
		return ApiResponse.ok(res);
	}
}
