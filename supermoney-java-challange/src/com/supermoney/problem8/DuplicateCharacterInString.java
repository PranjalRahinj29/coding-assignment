package com.supermoney.problem8;

import java.util.Scanner;

public class DuplicateCharacterInString {
    public static void duplicateCharacter(String inputString){
        int count = 0;
        char[] string = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (string[i] == string[j]) {
                    System.out.println(string[j]);
                    count++;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        duplicateCharacter(str);

    }
}
