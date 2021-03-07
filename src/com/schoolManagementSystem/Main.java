package com.schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher Lizzy =new Teacher(1, "Lizzy", 500);
        Teacher Mellisa =new Teacher(2, "Melissa", 700);
        Teacher Willy =new Teacher(3, "Willy", 400);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Mellisa);
        teacherList.add(Willy);

        Student Tamara = new Student(1, "Tamara", 4);
        Student Dennis = new Student(2, "Dennis", 12);
        Student Mustafa = new Student(3, "Mustafa", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Tamara);
        studentList.add(Dennis);
        studentList.add(Mustafa);

        School GPS = new School(teacherList, studentList);

        Teacher Megan = new Teacher(6,"Megan",900);
        GPS.addTeacher(Megan);

        Tamara.payFees(5000);
        Dennis.payFees(6000);
        System.out.println("GPS has earned $"+GPS.getTotalMoneyEarned());

        System.out.println("..... Making School pay salary to teachers....");
        Lizzy.receiveSalary(Lizzy.getSalary());
        Mellisa.receiveSalary(Mellisa.getSalary());
        System.out.println("GPS has spent " + Lizzy.getSalary() + " on " + Lizzy.getName() + " and " + Mellisa.getSalary() + " on " + Mellisa.getName() + " and now has $ " + GPS.getTotalMoneyEarned() + " as the balance." );

        System.out.println(Dennis);
        System.out.println(Lizzy);
        System.out.println(Mustafa);
        System.out.println(Mellisa);
        System.out.println(Megan);


    }

}
