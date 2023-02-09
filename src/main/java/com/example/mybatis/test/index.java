package com.example.mybatis.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class index {

    @RequestMapping(value = "/helloWorld")
    public String test(){
        System.out.println("测试开始");
        return "/index/helloWorld";
    }

    public static void main(String[] args){
        int x = 5;
        switch (x){
            case 1 : System.out.println("1111111");
            case 3 : System.out.println("2222222");
            case 2 : System.out.println("33333333");
            default:System.out.println("444444");
        }
    }
}
