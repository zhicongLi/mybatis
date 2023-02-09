package com.example.mybatis.domain;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args){
        Map<String,Object> map = new HashMap<>();
        map.put("data1","hahahahahha");
        map.put("data2","oooooooooooo");
        Test test = new Test();
        webMessage w = test.test(map);
        System.out.println(w.toString());
    }
    public webMessage test(Map<String,Object> map){
        String data1 = (String) map.get("data1");
        String data2 = (String) map.get("data2");
        String data3 = (String) map.get("data3");

        System.out.println("=======" + data1);
        System.out.println("=======" + data2);
        System.out.println("=======" + data3);

        webMessage web = new webMessage();
        web.setCode("200");
        web.setMessage("执行成功");
        return web;
    }
}
