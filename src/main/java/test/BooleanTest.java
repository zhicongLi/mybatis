package test;

import org.junit.Test;

/**
 * @autor lzc
 * @create 2023-06-06 下午5:53
 */
public class BooleanTest {

    public boolean test(){
        return true;
    }

    public Boolean test1(){
        return true;
    }

    @Test
    public void boTest(){
        Boolean b = true;
        boolean b1 = true;
        System.out.println(b == b1);
        System.out.println(test());
        System.out.println(test1());
        System.out.println(test() == test1());
    }
}
