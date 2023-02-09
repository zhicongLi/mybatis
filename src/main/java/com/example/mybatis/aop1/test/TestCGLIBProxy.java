package com.example.mybatis.aop1.test;

import java.lang.reflect.Method;

import com.example.mybatis.aop1.bean.Boss;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class TestCGLIBProxy {

	public static void main(String[] args) {
		Boss xdd = new Boss();
		//xdd.eat();

		Enhancer en = new Enhancer();//��ǿ��
		en.setSuperclass(xdd.getClass());//���ô������͵ĸ��� -> Ŀ������
		en.setCallback(new MethodInterceptor(){
			@Override
			public Object intercept(Object obj, Method m, Object[] args,
					MethodProxy mp) throws Throwable {
				if("eat".equals(m.getName())){
					System.out.println("== ���� ==");
					Object value = m.invoke(xdd,args);
					//Object value = mp.invokeSuper(obj, args);
					System.out.println("== ˢ�� ==");
					return value;
				}else{
					System.out.println("== ���ð� �Ҿܾ����Լ�˯�� ==");
					return m.invoke(xdd,args);
				}
			}
		});
		Boss ms = (Boss)en.create();
		ms.sleep();

	}

}
