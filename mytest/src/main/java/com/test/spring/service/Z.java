package com.test.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @描述：TODO
 * @创建作者 : CP
 * @创建时间: 2020-09-09 16:32
 */
@Component
public class Z implements ApplicationContextAware {

	@Autowired
	One one;//注入One
	//构造方法
	public Z()
	{
		System.out.println("Z create");
	}

	//声明周期初始化方法
	@PostConstruct
	public void zinit()
	{
		System.out.println("call z lifecycle init callback");
	}

	//applicationContextAware回调方法
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("call aware callback");
	}
}
