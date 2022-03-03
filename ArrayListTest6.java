package com.yechao.arraylist;

import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest6 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1850300065", "叶小超", 23, "18计科1"));
        students.add(new Student("1850300062", "陈志峰", 21, "18计科1"));
        students.add(new Student("1850300046", "蔡德午", 23, "18计科1"));
        students.add(new Student("1850300065", "任义仁", 22, "18计科3"));

        for (int i = 0; i < students.size(); i++) {
            Student s = new Student();
            s = students.get(i);
            System.out.println(s.getStudyId() + "\t\t" + s.getName() + "\t\t" +
                    s.getAge() + "\t\t" + s.getClassName());
        }

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("请您输入要查询的学生的学号：");
            String id = in.next();
            Student s = getStudentByStudyId(students, id);
            if (s == null){
                System.out.println("查无此人！");
            }else{
                System.out.println(s.getStudyId() + "\t\t" + s.getName() + "\t\t" +
                        s.getAge() + "\t\t" + s.getClassName());
            }
        }
    }

    public static Student getStudentByStudyId(ArrayList<Student> students, String studyId){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudyId().equals(studyId)){
                return s;
            }
        }
        return null;
    }



}
