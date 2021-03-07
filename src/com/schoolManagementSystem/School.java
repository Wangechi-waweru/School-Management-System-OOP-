package com.schoolManagementSystem;

import java.util.List;

/**
 * A school can have many teachers and students.
 * Use an array list.
 */


public class School {

    private List <Teacher> teachers;
    private List <Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //Created as soon as a new object is created.
    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }


    public List<Teacher> getTeacher() {
        return teachers;
    }


    //Adds a teacher to the school.
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
         totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //Money spent is the salary paid to the teachers.
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
