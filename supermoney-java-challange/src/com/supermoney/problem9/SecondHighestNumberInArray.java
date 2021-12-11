package com.supermoney.problem9;

import java.util.Scanner;

public class SecondHighestNumberInArray {
    private static int secondHighestNumberArray(int[] inputArr, int size) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (inputArr[i] > inputArr[j]) {
                    temp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
        }
        return inputArr[size - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an arraysize:");
        int n = sc.nextInt();
        System.out.println("Enter elements in an array :");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int n1 = arr.length;
        System.out.println("Second Highest: "+ secondHighestNumberArray(arr, n1));
    }
}
