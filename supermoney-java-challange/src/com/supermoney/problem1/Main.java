package com.supermoney.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee id");//taking all the inputs from the user
        int employeeId = scan.nextInt();
        System.out.println("Enter the employee name");
        String empName = scan.next();
        System.out.println("Enter the basic salary of an employee");
        double basicSalary = scan.nextDouble();

        Employee emp = new Employee(employeeId, empName, basicSalary);
        System.out.println(emp);
    }
}
