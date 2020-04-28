package com.wpz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api("Start")
public class Start {

	@ResponseBody
	@ApiOperation(value = "Hello World")
	@RequestMapping("/hello")
	public String start() {

		return "Hello World";
	}

	@ResponseBody
	@ApiOperation(value = "Map Output")
	@RequestMapping("/user")
	public Map<String, Object> getMap() {

		Map<String, Object> user = new HashMap<String, Object>();

		user.put("姓名", "王彭真");
		user.put("年龄", "27");
		user.put("性别", "男");

		return user;
	}
}