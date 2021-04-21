package com.cry.controller;

import com.cry.entity.UserEntity;
import com.cry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/findSysConf")
	public List<UserEntity> findUser() {
		return userService.findUser();
	}

	@RequestMapping("/insertSysConf")
	public List<UserEntity> insertUser(String id, String sys_value, String sys_key, String delete_flag) {
		return userService.insertUser(id, sys_value, sys_key, delete_flag);
	}

}
