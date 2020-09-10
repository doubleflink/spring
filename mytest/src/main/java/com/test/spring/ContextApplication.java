package com.test.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @描述：TODO
 * @创建作者 :double
 */
public class ContextApplication {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User user = ctx.getBean(User.class);
		System.out.println("user = " + user);
	}
}
