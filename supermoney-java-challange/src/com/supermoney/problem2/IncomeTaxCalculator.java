package com.supermoney.problem2;

import java.util.Scanner;

public class IncomeTaxCalculator {
    private static double calculateTax(double inputIncome) {
        double tax = 0;
        if (inputIncome <= 250000) {
            tax = 0;
        } else if (inputIncome <= 500000) {
            tax = 0.05 * (inputIncome - 250000);
        } else if (inputIncome <= 1000000) {
            tax = (0.05 * 250000) + (0.2 * (inputIncome - 500000));
        } else {
            tax = ((0.05 * 250000) + (0.2 * 500000)) + (0.3 * (inputIncome - 1000000));
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a taxable income :");
        double income = sc.nextInt();
        double totalTax = calculateTax(income);
        System.out.println("Your Total tax = " + totalTax);
    }
}
