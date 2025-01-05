package com.guvi.day4.task2;

public class Main1D {

    public static void main(String[] args) {
        // Create an instance of Employee
        Person1D emp = new Person1D("Diki", 22, 51899600, 100000);

        // Display employee information
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Employee Age: " + emp.age);
        System.out.println("Employee ID: " + emp.emp_ID);
        System.out.println("Employee Salary: $" + emp.emp_Sal);
    }
}

