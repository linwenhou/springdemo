package com.venvo.entity.factory;

import com.venvo.entity.User;

/**
 * @author venvo
 * @date 2021-06-06 10:06
 * @description
 * @modified By
 * @version: jdk1.8
 */
//静态工厂调用
public class StaticFactory {
	//静态的方法，返回User对象
	public static User getUser() {
		return new User();
	}
}
