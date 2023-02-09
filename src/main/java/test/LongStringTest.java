package test;

public class LongStringTest {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }



    public static int lengthOfLongestSubstring(String s) {
        int x = 0;
        StringBuffer sb = new StringBuffer();
        for(int y = 0;y < s.length()-1;y++){
            if(sb.toString().indexOf(s.substring(y,y+1)) == -1){
                sb.append(s, y, y+1);
                if(sb.length() > x){
                    x = sb.length();
                }
            }else{
               lengthOfLongestSubstring(s.substring(0,1));
            }
        }
        return x;
    }
}
