package com.yechao.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("蔡德文是儿子");
        list.add("叶超是爸爸");
        list.add(111);
        System.out.println(list);

        list.add(2,"吕莹莹是妈妈");
        System.out.println(list);
    }
}
