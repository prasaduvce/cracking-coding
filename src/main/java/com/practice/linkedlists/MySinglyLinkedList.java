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

	public void display() {
		if (head == null) {
			System.out.println("Empty Linked list");
			return;
		}

		for (Node1 tmp=head;tmp != null; tmp=tmp.getLink()) {
			System.out.print(tmp.getData()+" -> ");
		}

	}
}
