package test;

import java.io.*;
import java.net.URL;

/**
 * @autor lzc
 * @create 2023-08-10 下午4:48
 */
public class PTest {
    public static void main(String[] args) throws IOException {
        URL url =new URL("https://blog.csdn.net/weixin_42598278/article/details/129582935");
        InputStream inputStream = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        // 创建输出流对象
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        // 进行数据的读写
        String lineString;// 用于存储读取到的数据
        while ((lineString = reader.readLine()) != null) {
            bWriter.write(lineString);
            bWriter.newLine();
        }
        bWriter.close();
        reader.close();
    }
}
