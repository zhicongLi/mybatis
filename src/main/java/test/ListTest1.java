package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListTest1 {

    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        Map map1 = new HashMap();
        map1.put("key","123");
        map1.put("password","321");

        Map map2 = new HashMap();
        map2.put("key","456");
        map2.put("password","654");
        list.add(map1);
        list.add(map2);

        System.out.println(list.stream().map(m -> {return m.get("key");}).collect(Collectors.toList()));
        List<String> strList = list.stream().map(m -> {return m.get("key");}).collect(Collectors.toList());
        System.out.println(strList);
    }
}
