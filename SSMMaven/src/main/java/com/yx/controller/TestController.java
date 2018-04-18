package com.yx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yx.entity.Test;
import com.yx.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/testlist")
	public String testlist() {
		Test test = testService.getTestInfoById("1");
		return "test";
	}
}
