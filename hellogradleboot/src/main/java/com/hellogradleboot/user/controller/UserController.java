package com.hellogradleboot.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hellogradleboot.user.service.UserService;

@Controller
@SuppressWarnings("static-access")
public class UserController {
	/*이하 멤버변수*/
	public static final String SERVICE_NAME = "user";
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	private final UserService userService;

	/*이하 생성자*/
	@Autowired
	public UserController (UserService userService) {
		this.userService = userService;
	}

	/*이하 Public 메소드*/
	@GetMapping({"/user/join"})
	public String joinForm(Model model) {
		final String VIEW = String.format("/%s/form", this.SERVICE_NAME);
		model.addAttribute("serviceName", this.SERVICE_NAME);
		return VIEW;
	}

	@PutMapping({"/user/join"})
	public String join() {
		return "";
	}

	@DeleteMapping({"/user/withdraw"})
	public String withDraw() {
		return "";
	}

	@GetMapping({"/user/login"})
	public String loginForm(Model model) {
		final String VIEW = String.format("/%s/login", this.SERVICE_NAME);
		model.addAttribute("serviceName", this.SERVICE_NAME);
		return VIEW;
	}

	@PostMapping({"/user/login"})
	public String login() {
		return "";
	}

	@PostMapping({"/user/logout"})
	public String logout() {
		return "";
	}
}
