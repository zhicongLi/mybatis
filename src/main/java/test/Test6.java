package test;

public class Test6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        //System.out.println(a == b);

        String s = new String("abc");
        String t = "abc";

        System.out.println(s == t);
        System.out.println(s.equals(t));
    }
}
