package com.practice.facebook;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeCreatePathMatchingSum {

    public static void main(String[] args) {
        BTreeNode root = new BTreeNode(null, null, 10);
        BTreeNode node16 = new BTreeNode(null, null, 16);
        BTreeNode nodeMinus3 = new BTreeNode(null, null, -3);
        BTreeNode node6 = new BTreeNode(null, null, 6);
        BTreeNode node11 = new BTreeNode(null, null, 11);
        BTreeNode node5 = new BTreeNode(node6, node11, 5);

        node16.setRight(nodeMinus3);
        root.setLeft(node16);
        root.setRight(node5);
        ArrayList<Integer> resultList = new ArrayList<>();
        //printTooToLeafNodeForASepcificSum(root, 26, resultList);

        int maxNodeSum = rootToLeafNodeSum(root);
        System.out.println("maxNodeSum ==> "+maxNodeSum);
        printTooToLeafNodeForASepcificSum(root, maxNodeSum, resultList);
        System.out.println("resultList ==> "+resultList);
    }

    private static boolean printTooToLeafNodeForASepcificSum(BTreeNode root, int sum, List<Integer> resultList) {
        if (root == null) {
            return false;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            if (root.getData().equals(sum)) {
                resultList.add(root.getData());
                return true;
            } else {
                return false;
            }
        }
        if (root.getLeft() != null && printTooToLeafNodeForASepcificSum(root.getLeft(), sum-root.getData(), resultList)) {
            resultList.add(root.getData());
            return true;
        }
        if (root.getRight() != null && printTooToLeafNodeForASepcificSum(root.getRight(), sum-root.getData(), resultList)) {
            resultList.add(root.getData());
            return true;
        }
        return false;
    }

    private static int rootToLeafNodeSum(BTreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = rootToLeafNodeSum(root.getLeft());
        int right = rootToLeafNodeSum(root.getRight());

        if (left > right) {
            return left + root.getData();
        }
        return right + root.getData();
    }
}

class BTreeNode {
    BTreeNode left;
    BTreeNode right;
    Integer data;

    public BTreeNode() {
    }

    public BTreeNode(BTreeNode left, BTreeNode right, Integer data) {
        this.left = left;
        this.right = right;
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

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}