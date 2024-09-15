package com.example.demo.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Salman", 34);
        map.put("Affan", 6);
        map.put("Hannan", 4);
        map.put("Sharjeela", 32);
        map.put("Adnan", 36);

        //map.forEach((key,value)-> System.out.println(key + "=" + value));
        // map.entrySet().forEach((entry)-> System.out.println(entry.getKey()));


        LinkedHashMap<Object, Object> collect2 = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(LinkedHashMap::new, (m, entry) -> m.put(entry.getKey(), entry.getValue()), Map::putAll);

        System.out.println(collect2);

    }
}
