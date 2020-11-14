package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Sparrow", "Jack");
        map.put("Bond", "James");
        map.put("Anderson", "Thomas");
        map.put("Richer", "Jack");
        map.put("Parker", "Richard");
        map.put("Queen", "Harley");
        map.put("White", "Thomas");
        map.put("Dallas", "Lilu");
        map.put("Black", "Alice");
        map.put("Zorg", "Jean-Baptiste");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> list = new ArrayList<>();
        String[] arr = map.values().toArray(new String[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    list.add(arr[i]);
                }
            }
        }
        for (String el : list) {
            removeItemFromMapByValue(map, el);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
