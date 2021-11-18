package com.medinar.hackerrank.challenges.java.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Add integers to list l
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            if (scan.next().equals("Insert")) {
                list.add(scan.nextInt(), scan.nextInt());
            } else {
                list.remove(scan.nextInt());
            }
        }
        scan.close();

        list.forEach(num -> System.out.print(num + " "));
    }
}
