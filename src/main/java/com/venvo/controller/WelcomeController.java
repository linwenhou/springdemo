package com.venvo.controller;

import com.venvo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author venvo
 * @date 2021-06-06 09:27
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	public void handleController() {
		welcomeService.sayHello("6666");
	}
}
