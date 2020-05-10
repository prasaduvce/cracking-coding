package com.practice.facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFSTraversalWithLevelAverageAtLevel {

    public static void main(String[] args) {
        TNodeNew node6 = new TNodeNew(6, null, null);
        TNodeNew node4 = new TNodeNew(4, null, null);
        TNodeNew node2 = new TNodeNew(2, null, null);
        TNodeNew node5 = new TNodeNew(5, null, null);
        TNodeNew node1 = new TNodeNew(1, null, null);
        TNodeNew node3 = new TNodeNew(3, null, null);
        TNodeNew node10 = new TNodeNew(10, null, null);
        TNodeNew node7 = new TNodeNew(7, null, null);
        TNodeNew node9 = new TNodeNew(9, null, null);
        TNodeNew node8 = new TNodeNew(8, null, null);
        TNodeNew node11 = new TNodeNew(11, null, null);

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

        depthFirstTraversalNew(node6);

    }

    private static void depthFirstTraversalNew(TNodeNew node) {
        if (node == null) {
            System.out.println("No tree nodes to print");
            return;
        }
        int level = 1;
        Queue<Pair> discoveredElements = new LinkedList<>();
        discoveredElements.add(new Pair(node, 1));
        Map<Integer, List<Integer>> levelNumsMap = new HashMap<>();
        while (!discoveredElements.isEmpty()) {
            TNodeNew queueElement = discoveredElements.element().getNode();
            Integer discoveredLevel = discoveredElements.element().getLevel();
            System.out.println("Processing data " + queueElement.getData() + ", At level " + discoveredLevel);
            if (levelNumsMap.get(discoveredLevel) == null) {
                List<Integer> integers = new ArrayList<>();
                integers.add(queueElement.getData());
                levelNumsMap.put(discoveredLevel, integers);
            } else {
                List<Integer> integers = levelNumsMap.get(discoveredLevel);
                integers.add(queueElement.getData());
            }
            if (queueElement.getLeft() != null || queueElement.getRight() != null) {
                level = discoveredLevel;
                level++;
            }
            if (queueElement.getLeft() != null) {
                discoveredElements.add(new Pair(queueElement.getLeft(), level));
            }
            if (queueElement.getRight() != null) {
                discoveredElements.add(new Pair(queueElement.getRight(), level));
            }
            discoveredElements.remove();
        }
        System.out.println("levelNumsMap ====> "+levelNumsMap);
        levelNumsMap.forEach((levelKey, nums) -> {
            int sum = nums.stream().mapToInt(Integer::intValue).sum();
            int avg = sum / levelKey;
            System.out.println("Level "+levelKey+", Sum : "+sum+", avg: "+avg);
        });
    }
}

class TNodeNew {
    private int data;
    private TNodeNew left;
    private TNodeNew right;

    public TNodeNew(int data, TNodeNew left, TNodeNew right) {
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

    public TNodeNew getLeft() {
        return left;
    }

    public void setLeft(TNodeNew left) {
        this.left = left;
    }

    public TNodeNew getRight() {
        return right;
    }

    public void setRight(TNodeNew right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TNodeNew{" +
            "data=" + data +
            ", left=" + left +
            ", right=" + right +
            '}';
    }
}

class Pair {
    private TNodeNew node;
    private Integer level;

    public Pair(TNodeNew node, Integer level) {
        this.node = node;
        this.level = level;
    }

    public TNodeNew getNode() {
        return node;
    }

    public void setNode(TNodeNew node) {
        this.node = node;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pair{" +
            "node=" + node +
            ", level=" + level +
            '}';
    }
}