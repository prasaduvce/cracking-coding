package com.practice.tress;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    private String value;
    private Node parent;
    private List<Node> children;

    public Node(Node parent) {
        this.parent = parent;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public List<Node> getChildren() {
        if (children == null) {
            children = new ArrayList<>();
        }
        return children;
    }

}

public class SingleTreeChildrenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        System.out.println("Enter Root Node value");
        String root = scanner.next();

        Node rootNode = new Node(null);
        rootNode.setValue(root);
        do {
            printTree(rootNode, " ");
            System.out.println("Select 1 or 2");
            System.out.println("1: CREATE TREE");
            System.out.println("2: EXIT");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter child node value");
                    String childNodeValue = scanner.next();
                    addChild(rootNode, childNodeValue);
                    break;
                case 2:
                    System.out.println("Exiting the Tree operations");
                    break;
                default:
                    System.out.println("Invalid option selected");
                    System.exit(1);
            }
        }while (option != 2);


        System.out.println("Enter children for the rootNode");
    }

    private static Node addChild(Node parentNode, String value) {
        Node childNode = new Node(parentNode);
        childNode.setValue(value);
        parentNode.getChildren().add(childNode);
        return parentNode;
    }

    private static void printTree(Node parentNode, String appender) {
        System.out.println(appender + " "+parentNode.getValue());
        for (Node child : parentNode.getChildren()) {
            printTree(child, appender);
        }
    }
}
