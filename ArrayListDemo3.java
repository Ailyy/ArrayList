package com.yechao.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Java");
        list.add("Mysql");
        list.add("叶超");
        list.add("蔡德武");
        // public E get(int index) 返回指定索引处的元素
        System.out.println(list.get(2));
        // public int size()  返回集合中的元素的个数，完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // public E remove(int index)  删除指定索引处的元素，返回被删除的元素
        System.out.println(list);
        String e = list.remove(1);
        System.out.println(e);
        System.out.println(list);

        // public boolean remove(Object o)  删除指定的元素，返回删除是否成功
        System.out.println(list.remove("蔡德武"));
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Mysql");
        list1.add("Java");
        list1.add("叶超");
        list1.add("蔡德武");
        // 只会删除第一次出现的元素
        System.out.println(list1.remove("Java"));
        System.out.println(list1);

        // public E set(int index,E element)  修改指定索引处的元素，返回被修改的元素
        String e2 = list1.set(2, "HTML");
        System.out.println(e2);
        System.out.println(list1);
    }
}
