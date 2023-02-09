package com.example.mybatis.aop1.test;

import com.example.mybatis.aop1.bean.JayZhou;
import com.example.mybatis.aop1.bean.Teacher;
import com.example.mybatis.aop1.factory.ProxyFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDKProxy {

	public static void main(String[] args) {
		Teacher jay = new JayZhou();
		Teacher dldx = (Teacher) ProxyFactory.createProxyWithJDK(jay);

		//Ϊjay����һ��������� ����jdk�ṩ�Ķ�̬����ʵ��
		/*
			1st.ClassLoader �������
				jay.getClass().getClassLoader()
				˭���ص�JayZhou.class ˭ȥ�������ɵĶ�̬�����.class
			2nd.Ҫʵ����Щ�ӿ�
				jay.getClass().getInterfaces()
				JayZhou.classʵ����Щ�ӿ� ���ǵĶ�̬�������ʵ����Щ�ӿ�
			3rd.InvocationHandler ���ÿ�����

		*/
		Teacher tea = (Teacher)Proxy.newProxyInstance(
				jay.getClass().getClassLoader(),
				jay.getClass().getInterfaces(),
				new InvocationHandler(){
					/*
						obj	 	=> �������
						m 		=> ������ķ���
						args 	=> ���÷���ʱ����Ĳ���
					*/
					@Override
					public Object invoke(Object obj, Method m, Object[] args)
							throws Throwable {
						System.out.println(" == ǰ�÷Ǻ��Ĳ��������ֻ� == ");
						Object value = m.invoke(jay, args);
						System.out.println(" == ���÷Ǻ��Ĳ���������ϰ == ");
						return value;
					}
				}
		);

		//jay.teach();
		tea.teach();

	}

}







