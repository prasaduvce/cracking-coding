package com.practice.linkedlists;

import java.util.Scanner;

public class SinglyLinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("Singly Linked List Test\n");
		char ch;
        /*  Perform list operations  */
		do
		{
			System.out.println("\nSingly Linked List Operations\n");
			System.out.println("1. insert at begining");
			System.out.println("2. insert at end");
			/*System.out.println("3. insert at position");
			System.out.println("4. delete at position");*/
			System.out.println("3. check empty");
			System.out.println("4. get size");
			System.out.println("5. Reverse List");
			int choice = scan.nextInt();
			switch (choice)
			{
				case 1 :
					System.out.println("Enter integer element to insert");
					list.insertAtStart( scan.nextInt() );
					break;
				case 2 :
					System.out.println("Enter integer element to insert");
					list.insertAtEnd( scan.nextInt() );
					break;
				/*case 3 :
					System.out.println("Enter integer element to insert");
					int num = scan.nextInt() ;
					System.out.println("Enter position");
					int pos = scan.nextInt() ;
					if (pos <= 1 || pos > list.getSize() )
						System.out.println("Invalid position\n");
					else
						list.insertAtPos(num, pos);
					break;
				case 4 :
					System.out.println("Enter position");
					int p = scan.nextInt() ;
					if (p < 1 || p > list.getSize() )
						System.out.println("Invalid position\n");
					else
						list.deleteAtPos(p);
					break;*/
				case 3 :
					System.out.println("Empty status = "+ list.isEmpty());
					break;
				case 4 :
					System.out.println("Size = "+ list.getSize() +" \n");
					break;
				case 5 :
					list.reverse();
					break;
				default :
					System.out.println("Wrong Entry \n ");
					break;
			}
            /*  Display List  */
			list.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y'|| ch == 'y');
	}

}

class Node {
	int data;
	Node link;

	public Node() {
		this.data = 0;
		this.link = null;
	}

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
class LinkedList {

	protected Node start;
	protected Node end;
	public int size;

	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public void insertAtStart(int value) {
		size++;
		Node node = new Node(value, null);
		if (start == null) {
			start = node;
			end = start;
		} else {
			node.setLink(start);
			start = node;
		}
	}

	public void insertAtEnd(int value) {
		size++;
		Node node = new Node(value, null);
		if (start == null) {
			start = node;
			end = start;
		} else {
			end.setLink(node);
			end = node;
		}
	}

	public void display() {
		if (size == 0) {
			System.out.println("Empty List");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
		}
		Node ptr = start;
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData()+ "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData()+ "\n");
	}

	public void reverse() {
		if (size == 0) {
			System.out.println("Empty List");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
		}
		Node prev = null;
		Node current = start;
		Node next = null;
		while (current != null) {
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
			//System.out.println("prev  : "+prev.data+", current : "+current.data+", next : "+next.data);
		}
		start = prev;
		//System.out.print(ptr.getData()+ "\n");
		//display();
	}
}

