package test;

/**
 * @autor lzc
 * @create 2023-08-17 下午6:14
 */
public class StringTest5 {

    public static void main(String[] args) {
        System.out.println(checkValue("31"));
    }

    //判断首字母是否为.开头 如果是 首字母加0
    public static String checkValue(String str){
        int x = str.indexOf(".");
        if(x == 0) return "0" + str;
        return str;
    }
}
