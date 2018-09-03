package com.medinar.hackerrank.challenges.regex.detect_html_tags;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author Rommel D. Medina
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern pattern = Pattern.compile("<([\\w]+)[ >/]");
        Set<String> htmlTags = new TreeSet<>();
        for (int i = 0; i <= n; i++) {
            Matcher matcher = pattern.matcher(sc.nextLine());
            while (matcher.find()) {
                htmlTags.add(matcher.group(1));
            }
        }
        sc.close();
        System.out.println(htmlTags.stream().collect(Collectors.joining(";")));
    }

}
