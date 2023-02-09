package test;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {


    public static void main(String[] args) {
        List<Map<String,Object>> map = createMap();
        for(Map<String,Object> m : map){
            int sum =(int)m.get("num1") + (int)m.get("num2") + (int)m.get("num3");
            m.put("sum",sum);
        }
        System.out.println(map);
    }

    public static List<Map<String,Object>> createMap(){
        List<Map<String,Object>> list = new ArrayList<>();
        HashMap map1 = new HashMap();
        map1.put("num1",1);
        map1.put("num3",0);
        map1.put("username","张靖宇");
        map1.put("num2",0);
        list.add(map1);

        HashMap map2 = new HashMap();
        map2.put("num1",13);
        map2.put("num3",11);
        map2.put("username","陈伟中");
        map2.put("num2",10);


        HashMap map3 = new HashMap();
        map3.put("num1",25);
        map3.put("num3",19);
        map3.put("username","乔日平");
        map3.put("num2",17);

        HashMap map4 = new HashMap();
        map4.put("num1",25);
        map4.put("num3",13);
        map4.put("username","韩阳");
        map4.put("num2",19);

        HashMap map5 = new HashMap();
        map5.put("num1",21);
        map5.put("num3",18);
        map5.put("username","程辉");
        map5.put("num2",15);

        HashMap map6 = new HashMap();
        map6.put("num1",4);
        map6.put("num3",0);
        map6.put("username","杨小虎");
        map6.put("num2",1);

        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);

        return list;
    }
}
