package com.medinar.hackerrank.challenges.java.generics;

/**
 *
 * @author Rommel Medina
 */
public class Printer<T> {

    public void printArray(T[] arr) {
        for (T o : arr) {
            System.out.println(o);
        }
    }
}
