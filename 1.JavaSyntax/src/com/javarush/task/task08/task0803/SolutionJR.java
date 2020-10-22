package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

public class SolutionJR {
    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, SolutionJR.Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, SolutionJR.Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, SolutionJR.Cat> addCatsToMap(String[] cats) {
        Map<String, SolutionJR.Cat> map = new HashMap<>();
        for (String name : cats) {
            map.put(name, new SolutionJR.Cat(name));
        }
        return map;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
