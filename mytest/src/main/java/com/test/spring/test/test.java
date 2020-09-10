package com.test.spring.test;

import com.test.spring.app.Appconfig;
import com.test.spring.service.One;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @描述：TODO
 * @创建作者 : CP
 * @创建时间: 2020-09-09 15:34
 */
public class test {

	public static void main(String[] args) {

		/**
		 * TODO 1.实例化Spring容器
		 *      2.扫描符合Springbean规则的class  --集合
		 *      3.遍历这个集合中的类--封装成一个bd对象  put beanDefinitionMap
		 *      4.遍历beanDefinitionMap --bd对象
		 *      5.解析----validate  解析是为了验证  验证是否是单例  是否是lazy
		 *      6.通过 bd--class  如果验证通过  bd对象就可以得到class对象
		 *      7.得到所有的构造方法  有了class对象就可以得到构造方法 --通过算法推断出合理的构造方法
		 *      8.通过这个合理的构造方法反射实例化一个对象
		 *      9.合并bd
		 *      10.提前暴露工厂--为了循环依赖
		 *      11.注入属性--判断是否需要完成属性填充；自动注入
		 *      12.执行部门aware接口
		 *      13.执行部分aware接口  leftcycle callback annn
		 *      14.执行生命周期回调方法  leftcycle callback interface
		 *      15.执行aop  代理 --有aop就执行  没用就不执行  --还会执行事件分发  有事件就执行  没有就不执行
		 *      16.put singletonobjects --put到单例池
		 *
		 *
		 */
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(context.getBean(One.class));
	}

	/**
	 * TODO 从以上代码可以正确获取Onebean,证明循环依赖成功
	 * TODO 但是循环依赖是可以关闭的  1.spring提供api来关闭循环依赖功能
	 * TODO 这里为了装逼  通过修改spring源码来关闭循环依赖功能
	 * TODO 具体步骤可见  进入AnnotationConfigApplicationContext类85行
	 */
}
