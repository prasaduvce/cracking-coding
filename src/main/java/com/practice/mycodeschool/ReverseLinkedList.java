package com.practice.mycodeschool;

class Node {
    private int data;
    private Node link;

    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}

public class ReverseLinkedList {

    public Node reverse(Node head) {
        Node prev= null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.getLink();
            cur.setLink(prev);
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public void print(Node head) {
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.getData());
            cur = cur.getLink();
        }
    }
}
