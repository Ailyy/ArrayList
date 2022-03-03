package com.yechao.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 输入一组分数，删除小于80的数
        list.add(80);
        list.add(81);
        list.add(70);
        list.add(90);
        list.add(59);
        list.add(85);
        list.add(78);
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            int score = list.get(i);
            if (score < 80){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
