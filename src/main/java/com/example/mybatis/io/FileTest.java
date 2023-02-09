package com.example.mybatis.io;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/admin/Desktop/ly/投稿流程角色配置.docx");
        File file1 = new File("/Users/admin/Desktop/资料");
        if(file.exists()){
            InputStream inputStream = new FileInputStream(file);
            byte[] data = new byte[1024];
            int len = 0;
            OutputStream out = new FileOutputStream(file1);
            while((len = inputStream.read(data)) != -1){
                out.write(data,0,len);
            }
            inputStream.close();
            out.flush();
            out.close();
        }
    }
}
