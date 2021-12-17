package com.medinar.hackerrank.challenges.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException ex) {
            System.out.println(ex.getClass().getName());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
