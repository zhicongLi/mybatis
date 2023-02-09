package test;
;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] digits = new int[]{1,2,3};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(String.valueOf(digits));
        StringBuffer sb = new StringBuffer();
        for(int x : digits){
            sb.append(x);
        }
        System.out.println(sb);
        int y = Integer.parseInt(sb.toString());
        y += 1;
        String s = String.valueOf(y);
        char[] i = s.toCharArray();
        int[] t = new int[i.length];
    }

    @Test
    public void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int i = 0;
        for(int x = 0; x < prices.length - 1; x++){
            for(int y = x + 1; y < prices.length; y++){
                if((prices[y] - prices[x]) > i){
                    i = (prices[y] - prices[x]);
                }
            }
        }
        System.out.println(i);
        int x = Integer.MAX_VALUE;
        System.out.println(x);
    }

}
