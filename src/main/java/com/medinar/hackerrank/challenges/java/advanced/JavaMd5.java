package com.medinar.hackerrank.challenges.java.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMd5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b: bytes) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
