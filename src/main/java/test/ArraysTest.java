package test;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    int c;
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4};
        List<int[]> list = Arrays.asList(a);
        System.out.println(list.toString());
        System.out.println(a.length);
        String str = " hello world ";
        System.out.println(str.lastIndexOf(' '));
        System.out.println(str.trim());
        System.out.println(str.substring(str.lastIndexOf(" ") + 1).length());
        StringBuffer sb = new StringBuffer();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb);
        int i = Integer.parseInt(sb.toString()) + 1;
        char[] c = String.valueOf(i).toCharArray();
        System.out.println("111111");
    }

}
