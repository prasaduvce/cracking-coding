package com.practice.facebook;

public class IsTreeBinarySearchTree {

    public static void main(String[] args) {
        BSTTNodeNew node6 = new BSTTNodeNew(6, null, null);
        BSTTNodeNew node4 = new BSTTNodeNew(4, null, null);
        BSTTNodeNew node2 = new BSTTNodeNew(2, null, null);
        BSTTNodeNew node5 = new BSTTNodeNew(5, null, null);
        BSTTNodeNew node1 = new BSTTNodeNew(1, null, null);
        BSTTNodeNew node3 = new BSTTNodeNew(3, null, null);
        BSTTNodeNew node10 = new BSTTNodeNew(10, null, null);
        BSTTNodeNew node7 = new BSTTNodeNew(7, null, null);
        BSTTNodeNew node9 = new BSTTNodeNew(9, null, null);
        BSTTNodeNew node8 = new BSTTNodeNew(8, null, null);
        BSTTNodeNew node11 = new BSTTNodeNew(11, null, null);

        node6.setLeft(node4);
        node4.setLeft(node2);
        node4.setRight(node5);
        node2.setLeft(node1);
        node2.setRight(node3);

        node6.setRight(node10);
        node10.setLeft(node7);
        node10.setRight(node11);

        node7.setRight(node9);
        node9.setLeft(node8);

        inorderTraversal(node6);
        System.out.println(isBst(node6));
        System.out.println(isBst(node6, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(isBstWithInorder(node6, Integer.MIN_VALUE));
    }

    private static boolean isBst(BSTTNodeNew root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        return root.getData() < maxValue
            && root.getData() > minValue
            && isBst(root.getLeft(), minValue, root.getData())
            && isBst(root.getRight(), root.getData(), maxValue);
    }

    //TODO: Most expensive
    private static boolean isBst(BSTTNodeNew root) {
        if (root == null) {
            return true;
        }
        return isSubTreeLesser(root.getLeft(), root.getData())
            && isSubTreeGreater(root.getRight(), root.getData())
            && isBst(root.getLeft())
            && isBst(root.getRight());
    }

    private static boolean isSubTreeLesser(BSTTNodeNew root, int value) {
        if (root == null) {
            return true;
        }
        return root.getData() <= value && isSubTreeLesser(root.getLeft(), value) && isSubTreeLesser(root.getRight(), value);
    }

    private static boolean isSubTreeGreater(BSTTNodeNew root, int value) {
        if (root == null) {
            return true;
        }
        return root.getData() > value && isSubTreeGreater(root.getLeft(), value)
            && isSubTreeGreater(root.getRight(), value);
    }

    private static void inorderTraversal(BSTTNodeNew root) {
        if (root != null) {
            inorderTraversal(root.getLeft());
            System.out.println(root.getData());
            inorderTraversal(root.getRight());
        }
    }

    private static boolean isBstWithInorder(BSTTNodeNew root, int prev) {
        if (root != null) {
            if (!isBstWithInorder(root.getLeft(), prev)) {
                return false;
            }
            if (root.getData() <= prev) {
                return false;
            }
            prev = root.getData();
            return isBstWithInorder(root.getRight(), prev);
        }
        return true;
    }
}

class BSTTNodeNew {
    private int data;
    private BSTTNodeNew left;
    private BSTTNodeNew right;

    public BSTTNodeNew(int data, BSTTNodeNew left, BSTTNodeNew right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BSTTNodeNew getLeft() {
        return left;
    }

    public void setLeft(BSTTNodeNew left) {
        this.left = left;
    }

    public BSTTNodeNew getRight() {
        return right;
    }

    public void setRight(BSTTNodeNew right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BSTTNodeNew{" +
            "data=" + data +
            ", left=" + left +
            ", right=" + right +
            '}';
    }
}