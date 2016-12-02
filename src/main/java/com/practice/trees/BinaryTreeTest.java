package com.practice.trees;


import java.util.Scanner;

class BTNode {
    private BTNode left;
    private BTNode right;
    private String data;

    public BTNode() {
    }

    public BTNode(String data) {
        this.data = data;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

class BinaryTree {
    private BTNode root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void create(String data) {
        root = create(root, data);
    }

    private BTNode create(BTNode node, String data) {
        if (node == null) {
            node = new BTNode(data);
        } else {
            if (node.getLeft() == null) {
                node.setLeft(create(node.getLeft(), data));
            } else {
                node.setRight(create(node.getRight(), data));
            }
        }
        return node;
    }

    public int count() {
        return count(root);
    }

    private int count(BTNode btNode) {
        if (btNode == null) {
            return 0;
        }
        int count = 1;
        count += count(btNode.getLeft());
        count += count(btNode.getRight());
        return count;
    }

    public boolean search(String val) {
        return search(root, val);
    }

    private boolean search(BTNode btNode, String val) {
        if (btNode.getData().equals(val)) {
            return true;
        }
        if (btNode.getLeft() != null) {
            if (search(btNode.getLeft(), val)) {
                return true;
            }
        }
        if (btNode.getRight() != null) {
            if (search(btNode.getRight(), val)) {
                return true;
            }
        }
        return false;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(BTNode btNode) {
        if (btNode != null) {
            inOrder(btNode.getLeft());
            System.out.println(btNode.getData());
            inOrder(btNode.getRight());
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(BTNode btNode) {
        if (btNode != null) {
            System.out.println(btNode.getData());
            preOrder(btNode.getLeft());
            preOrder(btNode.getRight());
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(BTNode btNode) {
        if (btNode != null) {
            postOrder(btNode.getLeft());
            postOrder(btNode.getRight());
            System.out.println(btNode.getData());
        }
    }
}

public class BinaryTreeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        System.out.println("Binary Tree Test");
        int option = 0;
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4: Check Empty");
            System.out.println("5: Quitting");
            option = scanner.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Enter Element to insert");
                    bt.create(scanner.next());
                    break;
                case 2:
                    System.out.println("Enter element to search");
                    String key = scanner.next();
                    System.out.println("Search Result : "+bt.search(key));
                    break;
                case 3:
                    System.out.println("Number of nodes ==> "+bt.count());
                    break;
                case 4:
                    if (bt.isEmpty()) {
                        System.out.printf("Empty Tree");
                    } else {
                        System.out.println("Tree is not empty");
                    }
                    break;
                case 5:
                    System.out.println("Quitting");
                    break;
                default: System.exit(1);
            }

            /*  Display tree  */
            System.out.print("\nPost order : ");
            bt.postOrder();
            System.out.print("\nPre order : ");
            bt.preOrder();
            System.out.print("\nIn order : ");
            bt.inOrder();
        }while (option != 5);
    }
}
