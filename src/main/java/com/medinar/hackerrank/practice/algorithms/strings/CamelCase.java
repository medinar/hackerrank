package com.medinar.hackerrank.practice.algorithms.strings;

import java.io.*;

class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here
        int wCtr = 1;
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            if (Character.isUpperCase(c)) {
                wCtr++;
            }
        }
        return wCtr;
    }

}

public class CamelCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

//        String t = "saveChangesInTheEditor";
//        int result = Result.camelcase(t);
        int result = Result.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
