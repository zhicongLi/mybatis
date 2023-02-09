package com.example.mybatis.file;

import java.io.File;

public class FileLength {

    public static void main(String[] args){
        File file = new File("/Users/admin/Downloads/网易企业邮箱集成接口技术白皮书v2.4.2BJ.doc");
        long l = file.length();
        double d1 = l;
        System.out.println(d1);
        System.out.println(l);

        int d = 3;
        System.out.println(d/2);
    }
}
