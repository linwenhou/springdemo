package com.venvo;

import com.venvo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author venvo
 * @date 2021-06-05 12:37
 * @description
 * @modified By
 * @version: jdk1.8
 */

public class Entrance {
	public static void main(String[] args) {
		System.out.println("hello world");
		String xmlPath = "//Users/venvo/develop/spring/spring-framework-5.2.0.RELEASE/springdemo/src/main/resources/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("强大的spring框架!");
	}
}
