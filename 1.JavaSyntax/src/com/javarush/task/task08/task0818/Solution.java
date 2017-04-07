package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ivanov", 300);
        map.put("Petrov", 200);
        map.put("Sidorov", 600);
        map.put("Bobikov", 500);
        map.put("Romanov", 700);
        map.put("Tokarev", 300);
        map.put("Torin", 200);
        map.put("Timoshin", 1000);
        map.put("Hutin", 900);
        map.put("Torgarien", 200);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> map2 = new HashMap<String, Integer>(map);
        Iterator<HashMap.Entry<String, Integer>> iterator = map2.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }

        //for (Map.Entry<String, Integer> pair: map.entrySet()) {
        //    if (pair.getValue() <= 500) map.remove(pair.getKey());
        //}
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}