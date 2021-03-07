package com.schoolManagementSystem;


//This class is responsible for keeping track of students fees, name, id and grade.
 public class Student {

     // Declaring  fields

     private int id;
     private String name;
     private int grade;
     private int feesPaid;
     private int feesTotal;

    /** A constructor creates a new student object by initialising the values.
     * Fees for every student is $30,000.
     */

        //Initialising fields inside a constructor.

     public Student(int id, String name, int grade){
         feesPaid = 0;

         //This keyword is used to link the id, name and grade from the class with the ones in the method
         this.id = id;
         this.name = name;
         this.grade =  grade;

     }

     //No altering students names and ids.

    /**
     * Used to return students grade
     * @param grade new grade for the student.
     */
    public void  setGrade(int grade){
         this.grade =grade;
    }

    /**
     * Add the fees to the fees paid.
     * The school receives the fees.
     * @param fees : fees that the student's pays
     */
    public  void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    //Returns the id, name, grade, fees paid and the total fees for the students.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal -= feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name is " + name + ". Total fees paid so far is $"+feesPaid +"." ;
    }
}
