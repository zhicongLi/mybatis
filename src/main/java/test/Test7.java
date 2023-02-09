package test;

public class Test7 {
    int a; //甲 最少一张 最多5张
    int b; //已 最少一张 最多6张
    int c; //丙 最少两张 最多7张
    int d; //丁 最少四张 最多10张

    public static void main(String[] args) {
        int x = 0;
        for(int a = 1; a < 6; a++){
            for(int b = 1; b < 7; b++){
                for(int c = 2; c < 8; c++){
                    for(int d = 4; d < 11; d++){
                        if((a + b + c + d) == 18){
                            System.out.println("甲：" + a + " 已：" + b + " 丙：" + c + " 丁：" + d);
                            x++;
                        }
                    }
                }
            }
        }
        System.out.println("最后结果为" + x);
    }
}
