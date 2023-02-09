package test;

import java.util.HashMap;
import java.util.Map;

public class Test13 {
    public static void main(String[] args) {
        int[] num = new int[]{2,2,1};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int x = 0; x < num.length; x++){
            if(map.containsKey(num[x])){
                map.put(num[x],map.get(num[x]) + 1);
            }else {
                map.put(num[x],1);
            }
        }

        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                System.out.println(m.getKey());
            }
        }
    }
}
