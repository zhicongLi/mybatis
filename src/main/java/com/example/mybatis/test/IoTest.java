package com.example.mybatis.test;

import java.io.File;
import java.io.IOException;

public class IoTest {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/admin/aaa/b");
        Boolean b = file.mkdir();
        System.out.println(b);

        File file1 = new File("/Users/admin/aaa/b.text");
        Boolean b1 = file1.createNewFile();
        System.out.println(b1);
    }
}
