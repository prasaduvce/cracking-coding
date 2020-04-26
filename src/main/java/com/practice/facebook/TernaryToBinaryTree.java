package com.practice.facebook;

public class TernaryToBinaryTree {

    private static char[] treeAsString = new char[100];

    public static void main(String[] args) {
        String str = "a?b?c:d:e";

        Node rootNode = covertToTree(str.toCharArray(), 0);
        printTree(rootNode);

    }

    private static Node covertToTree(char[] c, int i) {
        if (i >= c.length) {
            return null;
        }

        Node node = new Node(c[i]);
        ++i;
        if (i < c.length && c[i] == '?') {
            node.left = covertToTree(c, i+1);
        } else {
            node.right = covertToTree(c, i+1);
        }
        return node;
    }

    private static void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        printTree(root.left);
        printTree(root.right);
    }
}

class Node {
    public char value;
    public Node left;
    public Node right;

    public Node(char value) {
        this.value = value;
    }
}

