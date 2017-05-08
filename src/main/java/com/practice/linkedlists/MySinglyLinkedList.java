package com.practice.linkedlists;

class Node1 {
	int data;
	Node1 link;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node1 getLink() {
		return link;
	}

	public void setLink(Node1 link) {
		this.link = link;
	}
}

public class MySinglyLinkedList {

	private Node1 head;
	public Node1 insertToEnd(int item) {
		Node1 node = new Node1();
		node.setData(item);
		node.setLink(null);

		if (head == null) {
			head = node;
			return head;
		}
		Node1 cur = head;
		while (cur.getLink() != null) {
			cur = cur.getLink();
		}
		cur.setLink(node);
		return head;
	}

	public Node1 insertFront(int item) {
		Node1 newNode = new Node1();
		newNode.setData(item);
		newNode.setLink(null);

		if (head == null) {
			head = newNode;
			return head;
		}

		newNode.setLink(head);
		head = newNode;
		return head;
	}

	public void reverse() {

		if (head == null) {
			System.out.println("Empty list. Cannot reverse list");
			return;
		}
		Node1 prev= null;
		Node1 cur = head;
		Node1 next = null;

		while (cur != null) {
			next = cur.getLink();
			cur.link = prev;
			prev = cur;
			cur = next;
		}

		head = prev;
	}

	public void insertAtPosition(int pos, int item) {
		if (pos == 0 || pos < 0) {
			insertFront(item);
			return;
		}
		int listSize = size();
		if (pos > listSize) {
			insertToEnd(item);
			return;
		}
		Node1 cur = head;
		for (int i=1; i<pos-1; i++) {
			cur = cur.getLink();
		}
		Node1 nexNode = cur.getLink();
		Node1 newNode = new Node1();
		newNode.setData(item);
		newNode.setLink(nexNode);
		cur.setLink(newNode);
	}

	public void deleteFront() {
		if (size() == 0) {
			System.out.println("Nothing to delete");
			return;
		}
		Node1 tmp = head;
		head = head.getLink();
		System.out.println("\nItem "+tmp.getData()+" is removed.");
	}

	public void deleteRear() {
		if (deleteEmptyOrSingleElementList()) {
			return;
		}
		Node1 cur = head;
		Node1 prev = null;
		while (cur.getLink() != null) {
			prev = cur;
			cur = cur.getLink();
		}
		prev.setLink(null);
		System.out.println("\nItem "+cur.getData()+" is deleted");
	}

	public void deleteAtPosition(int position) {
		if (deleteEmptyOrSingleElementList()) {
			return;
		}
		Node1 cur = head;
		Node1 prev = null;
		for (int i=1;i<position;i++) {
			prev = cur;
			cur = cur.getLink();
		}
		Node1 next = cur.getLink();
		prev.setLink(next);
		System.out.println("\nDeleting item "+cur.getData()+", at position "+position);
	}

	private boolean deleteEmptyOrSingleElementList() {
		if (size() == 0) {
			System.out.println("Nothing to delete");
			return true;
		}
		if (size() == 1) {
			System.out.println("\nItem "+head.getData()+" is deleted");
			head = null;
			return true;
		}
		return false;
	}

	public void display() {
		if (head == null) {
			System.out.println("Empty Linked list");
			return;
		}

		for (Node1 tmp=head;tmp != null; tmp=tmp.getLink()) {
			System.out.print(tmp.getData()+" -> ");
		}
	}

	public int size() {
		int count = 0;
		for (Node1 tmp=head;tmp != null; tmp=tmp.getLink()) {
			++count;
		}
		return count;
	}
}
