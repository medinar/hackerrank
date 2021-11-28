package com.medinar.hackerrank.challenges.java.advanced;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSha256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(s.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b: bytes) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb);
        } catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
