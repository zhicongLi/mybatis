package test;

import java.util.HashSet;

public class CharTest1 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrXownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String sentence) {
            char[] str = sentence.toCharArray();
            HashSet set = new HashSet();
            for(int x = 0 ; x < str.length;x++){
                //判断非字母
                if((!Character.isLowerCase(str[x])) && (!Character.isUpperCase(str[x]))){
                    return false;
                }
                //统一转换为小写 防止重复
                if(Character.isUpperCase(str[x])){
                    int c = (int)str[x];
                    int a = c + 32;
                    char b = (char)a;
                    set.add(b);
                    continue;
                }
                set.add(str[x]);
            }
            if(set.size() == 26){
                return true;
            }
            return false;
        }
}
