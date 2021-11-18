package com.medinar.hackerrank.challenges;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAndReplace {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String formatString = bufferedReader.readLine();

        int replacementsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> replacements = IntStream.range(0, replacementsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        String result = Result.solution(formatString, replacements);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    static class Result {

        /*
         * Complete the 'solution' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING formatString
         *  2. STRING_ARRAY replacements
         */
        public static String solution(String formatString, List<String> replacements) {

            return formatString;
        }

    }
}
