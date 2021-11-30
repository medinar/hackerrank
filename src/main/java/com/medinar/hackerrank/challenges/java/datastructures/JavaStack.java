package com.medinar.hackerrank.challenges.java.datastructures;

import java.util.*;

public class JavaStack {

    public static void main(String []argh)
    {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Scanner sc = new Scanner(System.in);
        Deque<Character> stack = new ArrayDeque<>();
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            for (Character ch: input.toCharArray()) {
                stack.add(ch);
            }
        }

    }
}
