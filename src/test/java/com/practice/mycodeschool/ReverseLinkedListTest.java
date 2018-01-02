package com.practice.mycodeschool;

import org.junit.Test;

public class ReverseLinkedListTest {

    @Test
    public void test1() {
        Node node1 = new Node(2, null);
        Node node2 = new Node(3, node1);
        Node node3 = new Node(4, node2);
        Node node4 = new Node(5, node3);
        Node node5 = new Node(6, node4);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.print(node5);

        Node reversedList = reverseLinkedList.reverse(node5);
        reverseLinkedList.print(reversedList);
    }
}
