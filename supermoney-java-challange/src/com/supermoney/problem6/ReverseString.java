package com.supermoney.problem6;

import java.util.Scanner;

public class ReverseString {
    private static String reverse(String inputString) {
        char[] stringCharArray = inputString.toCharArray();
        int left = 0;
        int right = stringCharArray.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = stringCharArray[left];
            stringCharArray[left] = stringCharArray[right];
            stringCharArray[right] = temp;
        }
        return new String(stringCharArray);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        System.out.println( reverse(str));
    }
}
