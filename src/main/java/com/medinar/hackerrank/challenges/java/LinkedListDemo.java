package com.medinar.hackerrank.challenges.java;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
    }
}

class Demo {
    public void show() {
        LinkedList<String> list = new LinkedList<>();
        System.out.print(list.getFirst());
    }
}
