package test;

import java.io.UnsupportedEncodingException;

public class StringTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "椤圭洰閮ㄨ\uE74B棰戜細璁\uE1BE郴缁熸竻鍗?ae85ca3ef16241018a82246d8dca1e1c.xlsx";

        System.out.println(str.getBytes("UTF-8"));
        System.out.println(str.lastIndexOf("w"));
    }
}
