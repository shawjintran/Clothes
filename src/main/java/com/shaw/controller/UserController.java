package com.shaw.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api("用户的登录与注册")
@RestController
@RequestMapping("/user")
public class UserController {

	@ApiOperation("用户登录与注册")
	@PostMapping("/login")
	public void login(@RequestBody Map map){


	}

}
