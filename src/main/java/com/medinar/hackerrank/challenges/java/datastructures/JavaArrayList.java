package com.medinar.hackerrank.challenges.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<Integer> l = new ArrayList<>();
                int m = sc.nextInt();
                for (int j = 0; j < m; j++) {
                    l.add(sc.nextInt());
                }
                list.add(l);
            }

            int nq = sc.nextInt();
            for (int i = 0; i < nq; i++) {
                try {
                    int result = list.get(sc.nextInt() - 1).get(sc.nextInt() - 1);
                    System.out.println(result);
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
