package com.test.spring.util;

import com.test.spring.service.One;
import com.test.spring.service.Two;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @描述：TODO  扩展bean的后置处理器
 * @创建作者 : double
 * @创建时间: 2020-09-10 14:10
 */
@Component
public class MyBeanFactoryPostPorcesson implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("----------------------bfpp---------------------------");
	}
}
