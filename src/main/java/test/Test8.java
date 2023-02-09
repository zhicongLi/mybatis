package test;

import java.util.HashMap;
import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据");
        String s = scanner.next();
        char[] c = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int x = 0 ; x < c.length;x++){
            if(!hashMap.containsKey(c[x])){
                hashMap.put(c[x],1);
            }else{
                hashMap.put(c[x],hashMap.get(c[x]) + 1);
            }
        }
        System.out.println(hashMap.toString());
    }
}
