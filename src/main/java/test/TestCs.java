package test;

import java.util.ArrayList;

/**
 * @autor lzc
 * @create 2023-03-13 5:27 下午
 */
public class TestCs {
    public TestCs(){}
    static void print(ArrayList a1){
        System.out.println(a1);
        a1.add(2);
        a1 = new ArrayList();
        a1.add(3);
        a1.add(4);
        System.out.println("==================" + a1);
        System.out.println(a1.get(0));
    }

    public static void main(String[] args) {
        Test test = new Test();
        ArrayList a1 = new ArrayList();
        a1.add(1);
        System.out.println(a1);
        print(a1);
        System.out.println("==================" + a1);
        System.out.println(a1.get(1));
        int[] i = {1,2,3,4};
        int[] i1 = new int[4];
        i1[0] = 1;
        i1[1] = 2;
        i1[2] = 3;
        i1[3] = 4;
        int[] i2 = new int[]{1,2,3,4};
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }
}

