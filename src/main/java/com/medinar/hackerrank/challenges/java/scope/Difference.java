package com.medinar.hackerrank.challenges.java.scope;

import java.util.Arrays;

/**
 * 2018.08.07 11:32:00 AM
 *
 * @author Rommel Medina
 */
public class Difference {

    private final int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }

}
