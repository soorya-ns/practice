package com.sun.test.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralUtil {

    public static Map<String, String> getMapNameAndIdString() {

        Map<String, String> map = new HashMap<>();
        map.put("a", "AAA");
        map.put("d", "DDD");
        map.put("2", "222");
        map.put("b", "BBB");
        map.put("g", "GGG");
        map.put("5", "555");
        map.put("c", "CCCC");
        map.put("1", "111");

        return map;

    }
    public static Map<Integer, String> getMapNameAndIdInt() {

        Map<Integer, String> map = new HashMap<>();
        map.put(107, "CCCC");
        map.put(104, "BBB");
        map.put(102, "DDD");
        map.put(108, "111");
        map.put(103, "222");
        map.put(101, "AAA");
        map.put(105, "GGG");
        map.put(106, "555");
        return map;

    }

    public static List<Integer> getListId() {

        List<Integer> list = new ArrayList<>();
        list.add(1009);
        list.add(1011);
        list.add(1008);
        list.add(1019);
        list.add(1029);
        list.add(1015);
        list.add(1011);

        return list;

    }

    public static List<String> getListName() {

        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Shankara");
        list.add("Suhas");
        list.add("Leela");
        list.add("Aks");
        list.add("Perk");
        list.add("Jphn");

        return list;

    }
}
