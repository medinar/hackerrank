package com.medinar.hackerrank.challenges.array.binary_search;

import java.util.Scanner;

/**
 *
 * @author Rommel D. Medina
 */
public class Solution {

    static int getHeight(Node root) {
        int left = 0;
        int right = 0;

        if (root.left != null) {
            left = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            right = getHeight(root.right) + 1;
        }
        return (left > right) ? left : right;
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            }
            else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

}

class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
