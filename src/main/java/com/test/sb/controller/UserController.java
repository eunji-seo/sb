package com.test.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@GetMapping("/users/list")
	public @ResponseBody String getUsers() {
		return "user list test";
	}
}
