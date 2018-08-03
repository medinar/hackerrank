package com.medinar.hackerrank.challenges.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rommel Medina
 */
public class HackerLanguage {

    private static final String SUPPORTED_LANG = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA: ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC";

    public boolean isValid(String language) {
        Pattern p = Pattern.compile("\\b:?" + language + ":?\\b");
        Matcher m = p.matcher(SUPPORTED_LANG);
        return m.find();
    }

}

//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
//
//        scanner.close();
//    }
