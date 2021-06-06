package com.venvo.entity.factory;

import com.venvo.entity.User;

/**
 * @author venvo
 * @date 2021-06-06 10:55
 * @description 实例工厂调用
 * @modified By
 * @version: jdk1.8
 */
public class UserFactory {
	//普通的方法，返回User对象
	//不能通过类名调用，需要通过对象调用
	public   User getUser() {
		return new User();
	}
}
