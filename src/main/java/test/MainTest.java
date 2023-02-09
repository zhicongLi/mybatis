package test;

import com.sun.jndi.toolkit.url.UrlUtil;

import java.io.*;

public class MainTest {

    int x = 0;
    void test(){
        System.out.println("父类执行方法");
    }
    void test1(){
        System.out.println("父类执行方法1");
    }

    public static void main(String[] args) throws IOException {
      MainTest mainTest = new SonTest();
      mainTest.test();
    }
}
