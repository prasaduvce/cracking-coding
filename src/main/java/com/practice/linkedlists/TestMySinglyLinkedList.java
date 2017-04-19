package com.practice.linkedlists;


public class TestMySinglyLinkedList {
	public static void main(String[] args) {

		MySinglyLinkedList linkedList = new MySinglyLinkedList();
		linkedList.display();
		linkedList.insertToEnd(33);
		linkedList.insertToEnd(66);
		linkedList.insertFront(22);
		linkedList.insertFront(11);
		linkedList.insertToEnd(44);
		linkedList.insertToEnd(55);
		System.out.println("Displaying list===> ");
		linkedList.display();
		System.out.println("Reversing list===> ");
		linkedList.reverse();
		linkedList.display();
	}
}
