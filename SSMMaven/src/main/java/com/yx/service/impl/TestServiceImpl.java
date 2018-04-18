package com.yx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yx.dao.TestMapper;
import com.yx.entity.Test;
import com.yx.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestMapper testMaper;
	
	@Override
	public Test getTestInfoById(String id) {
		Test test = testMaper.selectByPrimaryKey(id);
		return test;
	}

}
