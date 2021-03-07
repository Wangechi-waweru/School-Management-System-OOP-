package com.schoolManagementSystem;

import java.util.List;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    public Teacher(int id, String name, int salary){
        this.id =id;
        this.name =name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    //Returns id, name and salary of the teacher.
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    //Set the salary
    public void setSalary(int salary){
        this.salary = salary;
    }


    //Add salary and removes total money earned from the school.
    public void receiveSalary(int salary ) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name + ". The total salary earned so far is $" + salaryEarned + ".";
    }
}
