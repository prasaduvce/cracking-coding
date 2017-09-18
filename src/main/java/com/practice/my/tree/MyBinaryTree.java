package com.practice.my.tree;

import java.util.Scanner;

class BTreeNode {
    BTreeNode left;
    BTreeNode right;
    int data;

    public BTreeNode() {
    }

    public BTreeNode(int data) {
        this.data = data;
    }

    public BTreeNode getLeft() {
        return left;
    }

    public void setLeft(BTreeNode left) {
        this.left = left;
    }

    public BTreeNode getRight() {
        return right;
    }

    public void setRight(BTreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class BinaryTree {

    private BTreeNode root;

    public void create(int val) {
        root = create(root, val);
    }

    private BTreeNode create(BTreeNode node, int val) {
        if (node == null) {
            node = new BTreeNode(val);
        } else {
            if (node.getLeft() == null) {
                node.setLeft(create(node.getLeft(), val));
            } else {
                node.setRight(create(node.getRight(), val));
            }
        }
        return node;
    }

    public void inorder() {
      inorder(root);
    }

    private void inorder(BTreeNode node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.println(" "+node.getData());
            inorder(node.getRight());
        }
    }
}

/**
 * Created by Renuka Prasad on 18-09-2017.
 */
public class MyBinaryTree {
    public static void main(String[] args) {
        int choice;
        BinaryTree binaryTree = new BinaryTree();
        do {
            System.out.println("Select options ");
            System.out.println("1: Create Binary Tree");
            System.out.println("2: Inorder Display Binary Tree");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to insert into tree");
                    int item = scanner.nextInt();
                    binaryTree.create(item);
                    break;
                case 2:
                    System.out.println("   ");
                    binaryTree.inorder();
                    break;
                default:
                    System.out.println("Invalid option entered. Quitting");
                    System.exit(0);
            }
        } while (choice != 3);
    }
}
