package com.example.mybatis.aop1.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory {
	public static Object createProxyWithCGLIB(Object tar){
		Enhancer en = new Enhancer();
		en.setSuperclass(tar.getClass());
		en.setCallback(new MethodInterceptor(){
			@Override
			public Object intercept(Object obj, Method m, Object[] args,
					MethodProxy mp) throws Throwable {
				System.out.println("ǰ�÷Ǻ��Ĳ���");
				Object value = m.invoke(tar,args);
				System.out.println("���÷Ǻ��Ĳ���");
				return value;
			}
		});
		Object obj = en.create();
		return obj;
	}
	public static Object createProxyWithJDK(Object tar){
		return Proxy.newProxyInstance(
				tar.getClass().getClassLoader(), 
				tar.getClass().getInterfaces(), 
				new InvocationHandler(){
					@Override
					public Object invoke(Object obj, Method m, Object[] args)
							throws Throwable {
						System.out.println("== ǰ�õķǺ��Ĳ��� ==");
						Object value = m.invoke(tar,args);
						System.out.println("== ���õķǺ��Ĳ��� ==");
						return value;
					}
				}
		);
	}
}
