package com.shiguang.pojo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","康家才");
        map.put("age","19");
//        System.out.println(map.get("name"));

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().getKey();
            System.out.println(map.get(key));

        }


    }

}
