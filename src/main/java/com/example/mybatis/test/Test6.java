package com.example.mybatis.test;

public class Test6 {

    public static void main(String[] args) {
      Integer x = 1;//自动装箱 Integer.valueOf();
        int y = x;//自动拆箱 x.intValue();
        String s = "1";
        Integer i = Integer.valueOf(s);
        i = Integer.parseInt(s);

        B bb = new B();
    }

}
class A{

    public A(){//4
        System.out.println("A类的无参构造方法");
    }
    {//3
        System.out.println("A类的普通代码块执行了");
    }
    static{//1
        System.out.println("A类的静态代码块执行了");
    }

    public void test(){
        System.out.println("测试父类方法");
    }
}
class B extends A{
    public B(){//6
        System.out.println("B类的无参构造方法执行了");
    }
    {//5
        System.out.println("B类的普通代码块执行了");
    }
    static{//2
        System.out.println("B类的静态代码块执行了");
    }
}
