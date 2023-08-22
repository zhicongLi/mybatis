package test;

import org.junit.Test;

public class Test12 {

    public static void main(String[] args) {
        String s = "12.01";
        System.out.println(s.length());
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
    }

    @Test
    public void longestPalindrome() {
        String s = "cbbd";
        String st = "";
        for(int x = 0; x < s.length() - 1; x++){
            for(int y = x + 1; y < s.length()-1; y++){
                String s1 = s.substring(x,y+1);
                StringBuffer sb = new StringBuffer(s1);
                if((sb.reverse().toString().equals(s1)) && (s1.length() > st.length())) {
                    st = sb.toString();
                }
            }
        }
        System.out.println(st);
    }
}
