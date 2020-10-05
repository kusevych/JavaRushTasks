package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int num = Integer.parseInt(reader.readLine());
            mainList.add(num);
        }

        for (Integer el: mainList) {
            if (el % 3 == 0)
                list1.add(el);
            if (el % 2 == 0)
                list2.add(el);
            if (el % 3 != 0 && el % 2 != 0)
                list3.add(el);
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer el: list)
            System.out.println(el);
    }
}
