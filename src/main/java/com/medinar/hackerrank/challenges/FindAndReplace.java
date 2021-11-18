package com.medinar.hackerrank.challenges;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAndReplace {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String formatString = bufferedReader.readLine();
//
//        int replacementsCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> replacements = IntStream.range(0, replacementsCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(Collectors.toList());
        String formatString = "I {{0} {0}} {like} {2}";
        List<String> replacements = new ArrayList<>();
        replacements.add("really");
        replacements.add("love");
        replacements.add("dogs");

        String result = Result.solution(formatString, replacements);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
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
            String[] strArr = formatString.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                // Check if string contains a pair of curly brackets
                if (str.contains("{") && str.contains("}")) {
                    try {
                        // Remove the curly brackets.
                        // Replace the placeholder with the entry on the list with the corresponding key index.
                        sb.append(replacements.get(Integer.parseInt(
                                str.replaceAll("\\{", "").replaceAll("}", "")
                        )));
                    } catch (NumberFormatException ignored) {
                        // Append the original string value if the value inside the curly brackets are non-numeric.
                        sb.append(str);
                    }
                } else {
                    // Append the original string value
                    sb.append(str);
                }
                sb.append(" ");
            }
            return sb.toString().trim();
        }

    }
}
