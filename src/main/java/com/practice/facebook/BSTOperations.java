package com.practice.facebook;

public class BSTOperations {

    public static void main(String[] args) {
        BSTOperations bstOperations = new BSTOperations();
        /*BSTNode root = bstOperations.createTree(15, null);
        bstOperations.createTree(10, root);
        bstOperations.createTree(20, root);
        bstOperations.createTree(8, root);
        bstOperations.createTree(12, root);
        bstOperations.createTree(17, root);
        bstOperations.createTree(25, root);
        bstOperations.inorderTraverse(root);
        System.out.println("Search Response: 8 "+bstOperations.search(root, 8));
        System.out.println("Search Response: 20 "+bstOperations.search(root, 20));
        System.out.println("Search Response: 11 "+bstOperations.search(root, 11));
        System.out.println("Min of Tree is: "+bstOperations.findMin(root));
        System.out.println("Max of Tree is: "+bstOperations.findMax(root));*/

        System.out.println("feature ===> "+Runtime.version());
        BSTOperations bstOperationsNew = new BSTOperations();
        BSTNode newRoot = bstOperationsNew.createTree(6, null);
        bstOperationsNew.createTree(4, newRoot);
        //bstOperationsNew.createTree(3, newRoot);
        bstOperationsNew.createTree(5, newRoot);
        //bstOperationsNew.createTree(2, newRoot);
        //bstOperationsNew.createTree(1, newRoot);
        bstOperationsNew.createTree(9, newRoot);
        bstOperationsNew.createTree(7, newRoot);
        //bstOperationsNew.createTree(10, newRoot);
        //bstOperationsNew.createTree(6, newRoot);
        bstOperationsNew.createTree(8, newRoot);
        //bstOperationsNew.createTree(11, newRoot);
        //bstOperationsNew.createTree(12, newRoot);
        bstOperationsNew.inorderTraverse(newRoot);
        System.out.println("findHeight Tree ==> "+bstOperationsNew.findHeight(newRoot));
        System.out.println("Left View Below");
        bstOperationsNew.printLeftView(newRoot);
        System.out.println("Right View Below");
        bstOperationsNew.printRightView(newRoot);
    }

    private BSTNode createTree(int data, BSTNode root) {
        BSTNode bstNode = new BSTNode(data, null, null);
        if (root == null) {
            return bstNode;
        }
        if (data <= root.getData()) {
            root.setLeft(createTree(data, root.getLeft()));
        } else {
            root.setRight(createTree(data, root.getRight()));
        }
        return root;
    }

    private void inorderTraverse(BSTNode root) {
        if (root != null) {
            inorderTraverse(root.getLeft());
            System.out.println(root.getData());
            inorderTraverse(root.getRight());
        }
    }

    private void printLeftView(BSTNode root) {
        if (root == null) {
           return;
        }
        if (root.getLeft() == null && root.getRight() != null) {
            printLeftView(root.getRight());
        }
        if (root.getLeft() == null || root.getLeft() != null) {
            System.out.println(root.getData());
        }
        printLeftView(root.getLeft());
    }

    private void printRightView(BSTNode root) {
        if (root == null) {
            return;
        }
        if (root.getRight() == null && root.getLeft() != null) {
            printLeftView(root.getLeft());
        }
        if (root.getRight() == null || root.getRight() != null) {
            System.out.println(root.getData());
        }
        printRightView(root.getRight());
    }

    private boolean search(BSTNode root, int element) {
        if (root == null) {
            return false;
        } else if (root.getData() == element) {
            return true;
        } else if (element <= root.getData()) {
            return search(root.getLeft(), element);
        } else {
            return search(root.getRight(), element);
        }
    }

    private int findMin(BSTNode root) {
        if (root != null && root.getLeft() != null) {
            return findMin(root.getLeft());
        }
        if (root != null) {
            return root.getData();
        }
        return 0;
    }

    private int findMax(BSTNode root) {
        if (root != null && root.getRight() != null) {
            return findMax(root.getRight());
        }
        if (root != null) {
            return root.getData();
        }
        return 0;
    }

    private int findHeight(BSTNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = findHeight(root.getLeft());
        int rightHeight = findHeight(root.getRight());
        return Integer.max(leftHeight, rightHeight)+1;
    }
}

class BSTNode {
    private int data;
    private BSTNode left;
    private BSTNode right;

    public BSTNode(int data, BSTNode left, BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BSTNode{" +
            "left=" + left +
            ", right=" + right +
            ", data=" + data +
            '}';
    }
}