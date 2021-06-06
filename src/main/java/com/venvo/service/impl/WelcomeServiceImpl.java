package com.venvo.service.impl;

import com.venvo.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * @author venvo
 * @date 2021-06-05 12:39
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("欢迎您：" + name);
		return "sucess1";
	}
}
