package test;

import java.sql.SQLOutput;

import static java.lang.Thread.sleep;

/**
 * @autor lzc
 * @create 2023-05-25 下午8:10
 */
public class MainTest11 {

    static{
        System.out.println("测试");
    }

    public static void test() throws InterruptedException {
        System.out.println("测试");
    }
}
class MainTest22{

    public static void main(String[] args) throws InterruptedException {
        MainTest11 mainTest11 = new MainTest11();
        Thread.sleep(10000);
        System.out.println("测试=========");
    }

}
