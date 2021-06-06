package com.venvo;

import com.venvo.controller.WelcomeController;
import com.venvo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author venvo
 * @date 2021-06-05 12:37
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Configuration
@ComponentScan("com.venvo")
public class Entrance {
//	public static void main(String[] args) {
//		System.out.println("hello world");
//		String xmlPath = "//Users/venvo/develop/spring/spring-framework-5.2.0.RELEASE/springdemo/src/main/resources/spring/spring-config.xml";
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
//		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
//		welcomeService.sayHello("强大的spring框架!!");
//	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : names) {
			System.out.println(beanDefinitionName);
		}

//		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeServiceImpl");
//		welcomeService.sayHello("强大的spring框架!!");
		WelcomeController welcomeController = (WelcomeController) applicationContext.getBean("welcomeController");
		welcomeController.handleController();
	}
}
