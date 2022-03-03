package com.yechao.arraylist;

import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {
        // 1、创建一个人物对象Person
        // 2、
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("叶超", 23, "帕拉梅拉"));
        person.add(new Person("仁义人", 22, "特斯拉"));
        person.add(new Person("蔡德武", 22, "吃了就拉"));

        for (int i = 0; i < person.size(); i++) {
            Person person1 = person.get(i);
            System.out.println("姓名：" + person1.getName());
            System.out.println("年龄：" + person1.getAge());
            System.out.println("座驾：" + person1.getCar());
            System.out.println("--------------------------");
        }
    }
}
