package test;

import org.junit.Test;

/**
 * @autor lzc
 * @create 2023-05-18 下午4:30
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] bills = new int[]{5,5,5,10,5,20,5,10,5,20};
        boolean b = lemonadeChange(bills);
        System.out.println(b);
    }
    public static boolean lemonadeChange(int[] bills) {
        int x = 0; int five = 0; int ten = 0;
        while(x < bills.length){
            if(x == 0 && bills[x] != 5) return false;
            if(x == 1 && bills[x] == 20) return false;
            if(bills[x] == 5){
                five ++;
                x++;
                continue;
            }
            if(bills[x] == 10){
                ten ++;
                if(five == 0){
                    System.out.println(x);
                    return false;
                }
                five --;
                x++;
                continue;
            }
            if(bills[x] == 20){
                if(ten == 0 && five < 3){
                    System.out.println(x);
                    return false;
                }else{
                    if(ten == 0){
                        five -= 3;
                    }else{
                        ten--;
                        five--;
                        x++;
                        continue;
                    }

                }
                if(ten > 0 && five < 1){
                    System.out.println(x);
                    return false;
                }else{
                    ten--;
                    five--;
                }

            }
            x++;
        }
        return true;
    }
}
