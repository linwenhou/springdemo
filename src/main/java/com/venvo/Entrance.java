package com.venvo;

import com.venvo.controller.WelcomeController;
import com.venvo.entity.User;
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
	public static void main(String[] args) {
		System.out.println("hello world");
		String xmlPath = "//Users/venvo/develop/spring/spring-framework-5.2.0.RELEASE/springdemo/src/main/resources/spring/spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("强大的spring框架!!");

		//得到无参构造函数创建的对象
		User user1a = (User) applicationContext.getBean("user1");
		User user1b = (User) applicationContext.getBean("user1");
		//得到静态工厂创建的对象
		User user2a = (User) applicationContext.getBean("user2");
		User user2b = (User) applicationContext.getBean("user2");
		//得到实例工厂创建的对象
		User user3a = (User) applicationContext.getBean("user3");
		User user3b = (User) applicationContext.getBean("user3");
		System.out.println("无参构造函数创建的对象" + user1a);
		System.out.println("无参构造函数创建的对象" + user1b);
		System.out.println("静态工厂创建的对象" + user2a);
		System.out.println("静态工厂创建的对象" + user2b);
		System.out.println("例工厂创建的对象" + user3a);
		System.out.println("例工厂创建的对象" + user3b);


	}

	public static void main2(String[] args) {
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
