package com.shaw.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.shaw.pojo.User;
import com.shaw.service.UserService;
import com.shaw.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Slf4j
@Api("用户的登录与注册")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;


	@ApiOperation("用户登录与注册")
	@PostMapping("/login")
	public R login(@RequestBody Map map, HttpSession session){
		log.info(map.toString());
		//获取账号id
		String id=map.get("id").toString();

		String password=map.get("password").toString();

		//查询
		LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.eq(User::getId,id);
		User user=userService.getOne(queryWrapper);

		//如果密码正确
		if(user.getPassword()==password){
			//session.getAttribute("user",user.getId());
		}


		//获取密码
		return R.ok();

	}

}
