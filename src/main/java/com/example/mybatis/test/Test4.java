package com.example.mybatis.test;

public class Test4 {

    public static void main(String[] args) {
        int[] arr = new int[]{34,65,42,64,56,23,11,99};
        for(int x : arr){
            System.out.println(x);
        }
        for(int y = 0;y < arr.length; y++){
            for(int x = 0; x < arr.length-1; x ++){
                if(arr[x] > arr[x+1]){
                    int z = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = z;
                }
            }
        }

        for(int x : arr){
            System.out.println("====" + x);
        }
    }
}
