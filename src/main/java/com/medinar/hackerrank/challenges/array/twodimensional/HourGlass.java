package com.medinar.hackerrank.challenges.array.twodimensional;

import java.util.Arrays;

/**
 *
 * @author Rommel Medina
 */
public class HourGlass {

    public int getMaxHourGlass(int[][] arr) {
        int[] sums = new int[16];
        int hgMax = 4; // Maximum number of hour glass per line is 4.
        int ctr = 0;
        for (int x = 0; x < hgMax; x++) {
            for (int y = 0; y < hgMax; y++) {
                ctr++;
                int sum = arr[x][y] + arr[x][y + 1] + arr[x][y + 2]
                        + arr[x + 1][y + 1]
                        + arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2];
                System.out.println("Hour Glass " + ctr);
                System.out.println(arr[x][y] + " "
                        + arr[x][y + 1] + " "
                        + arr[x][y + 2]
                );
                System.out.println("  " + arr[x + 1][y + 1] + " ");
                System.out.println(arr[x + 2][y] + " "
                        + arr[x + 2][y + 1] + " "
                        + arr[x + 2][y + 2]
                );
                System.out.println("sum = " + sum);
                sums[ctr - 1] = sum;
            }
        }
        Arrays.sort(sums);
        return sums[15];
    }

}
