package test;

public class Test4 {
    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        while(i < 10){
            x = x++;
            i++;
        }
        System.out.println(x);

        Object o = new Object();
        Object j = o;

        System.out.println(o == j);
        System.out.println(o.equals(j));
    }
}
