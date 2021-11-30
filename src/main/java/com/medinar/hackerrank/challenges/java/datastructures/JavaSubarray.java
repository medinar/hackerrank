package com.medinar.hackerrank.challenges.java.datastructures;

import java.io.*;
import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int negSums = 0;
            int sum   = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    sum += a[j];
                    if (sum < 0) {
                        negSums++;
                    }
                }
                sum = 0;
            }
            System.out.println(negSums);
        }
    }
}
