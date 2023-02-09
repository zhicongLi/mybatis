package com.example.mybatis.file;

import java.awt.*;

public class DownFIle {

    public static void main(String[] args) throws Exception{
        //创建一个可以实现人工智能的机器人对象
        Robot ro = new Robot();

        //死循环
        while(true){

            //Math.random() -> 系统生成一个随机数[0.0,1.0)
            //Math.random() * 1024 -> 0-1023.999999
            //x的取值敢为：0-1023
            int x = (int)(Math.random() * 1024);
            //y的取值范围：0-767
            int y = (int)(Math.random() * 768);
            ro.mouseMove(x,y);

        }
    }
}
