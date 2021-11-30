package com.medinar.hackerrank.challenges.java.datastructures;

import java.io.IOException;
import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[6][6];
        int largestSum = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in);) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            int sum = 0;
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
                            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > largestSum) largestSum = sum;
                }
            }
        }
        System.out.println(largestSum);
    }
}
