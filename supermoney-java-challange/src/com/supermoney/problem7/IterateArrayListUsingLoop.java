package com.supermoney.problem7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayListUsingLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("lmn");
        list.add("pqr");
        list.add("xyz");
       // printUsingForLoop(list);
       // printUsingAdvanceForLoop(list);
        printUsingWhileLoop(list);

    }

    private static void printUsingForLoop(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(" , ");
        }
    }

    private static void printUsingAdvanceForLoop(ArrayList<String> strList) {
        for (String strList1 : strList) {
            System.out.print(strList1);
            System.out.print(" , ");
        }
    }
    private static void printUsingWhileLoop(ArrayList<String> strList) {
        Iterator<String> iterator = strList.iterator();

        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
            System.out.print(" , ");
        }
    }
}
