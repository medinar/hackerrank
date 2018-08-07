package com.medinar.hackerrank.challenges.java.linkedlist;

/**
 *
 * @author Rommel Medina
 */
public class Solution {

    // Recursion
    public static Node insert(Node head, int data) {
        if (null == head) {
            head = new Node(data);
        }
        else if (null == head.next) {
            head.next = new Node(data);
        }
        else {
            insert(head.next, data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}
