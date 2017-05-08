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
		System.out.println("\nDisplaying list===> ");
		linkedList.display();
		insertAtPosition(linkedList, 561, -1);
		insertAtPosition(linkedList, 345, 0);
		insertAtPosition(linkedList, 99, 3);
		insertAtPosition(linkedList, 1432, 9999);
		System.out.println("\nReversing list===> ");
		linkedList.reverse();
		linkedList.display();
		linkedList.deleteFront();
		System.out.println("\nList after deleteFront");
		linkedList.display();
		linkedList.deleteRear();
		linkedList.deleteRear();
		linkedList.deleteRear();
		linkedList.deleteRear();
		linkedList.deleteRear();
		linkedList.deleteRear();
		linkedList.deleteRear();
		System.out.println("\nList after deleteRear");
		linkedList.display();
		System.out.println("\nSTART: Delete front 2nd time");
		linkedList.deleteFront();
		linkedList.deleteFront();
		linkedList.deleteFront();
		System.out.println("\nList after 2nd deleteFront");
		linkedList.display();
	}

	private static void insertAtPosition(MySinglyLinkedList linkedList, int item, int pos) {
		System.out.println("\nInserting item "+item+" at position "+pos);
		linkedList.insertAtPosition(pos, item);
		System.out.println("Displaying inserted element");
		linkedList.display();
	}


}
