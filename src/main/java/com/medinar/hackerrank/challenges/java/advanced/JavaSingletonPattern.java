package com.medinar.hackerrank.challenges.java.advanced;

public class JavaSingletonPattern {
    private JavaSingletonPattern() {
    }

    public String str;

    public static JavaSingletonPattern getSingleInstance() {
        return new JavaSingletonPattern();
    }

}
