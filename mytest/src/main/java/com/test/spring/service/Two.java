package com.test.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @描述：TODO
 * @创建作者 : double
 * @创建时间: 2020-09-09 15:38
 */
@Component
public class Two {

	@Autowired
	One one;
	public Two()
	{
		System.out.println("Two Create");
	}
}
