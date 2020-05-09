package com.practice.facebook;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSTraversal {

    public static void main(String[] args) {
        TNode nodeF = new TNode("F", null, null);
        TNode nodeD = new TNode("D", null, null);
        TNode nodeB = new TNode("B", null, null);
        TNode nodeE = new TNode("E", null, null);
        TNode nodeA = new TNode("A", null, null);
        TNode nodeC = new TNode("C", null, null);
        TNode nodeJ = new TNode("J", null, null);
        TNode nodeG = new TNode("G", null, null);
        TNode nodeK = new TNode("K", null, null);
        TNode nodeI = new TNode("I", null, null);
        TNode nodeH = new TNode("H", null, null);

        nodeF.setLeft(nodeD);
        nodeD.setLeft(nodeB);
        nodeD.setRight(nodeE);
        nodeB.setLeft(nodeA);
        nodeB.setRight(nodeC);

        nodeF.setRight(nodeJ);
        nodeJ.setLeft(nodeG);
        nodeJ.setRight(nodeK);

        nodeG.setRight(nodeI);
        nodeI.setLeft(nodeH);

        depthFirstTraversal(nodeF);

    }

    private static void depthFirstTraversal(TNode node) {
        if (node == null) {
            System.out.println("No tree nodes to print");
            return;
        }
        Queue<TNode> discoveredElements = new ArrayDeque<>();
        discoveredElements.add(node);
        while (!discoveredElements.isEmpty()) {
            TNode queueElement = discoveredElements.element();
            System.out.println(queueElement.getData());
            if (queueElement.getLeft() != null) {
                discoveredElements.add(queueElement.getLeft());
            }
            if (queueElement.getRight() != null) {
                discoveredElements.add(queueElement.getRight());
            }
            discoveredElements.remove();
        }
    }
}

class TNode {
    private String data;
    private TNode left;
    private TNode right;

    public TNode(String data, TNode left, TNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TNode getLeft() {
        return left;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public TNode getRight() {
        return right;
    }

    public void setRight(TNode right) {
        this.right = right;
    }
}
