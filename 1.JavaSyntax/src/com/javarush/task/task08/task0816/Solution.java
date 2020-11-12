package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Соколов", dateFormat.parse("JUNE 15 2012"));
        map.put("Сидорова", dateFormat.parse("MAY 10 2012"));
        map.put("Петров", dateFormat.parse("SEPTEMBER 5 2011"));
        map.put("Воробьева", dateFormat.parse("AUGUST 19 2012"));
        map.put("Иванов", dateFormat.parse("DECEMBER 1 2011"));
        map.put("Орлова", dateFormat.parse("OCTOBER 20 2012"));
        map.put("Журавлев", dateFormat.parse("MARCH 13 2012"));
        map.put("Маринина", dateFormat.parse("JULY 23 2011"));
        map.put("Соколова", dateFormat.parse("FEBRUARY 4 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.values().removeIf(value -> value.getMonth() < 8 && value.getMonth() > 4);
    }

    public static void main(String[] args) {

    }
}
