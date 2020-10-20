package com.capgemini.linkedlist1;

/**
 * @author ASUS
 *
 */
public class LinkedList {
	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * @param newNode
	 */
	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}


	/**
	 * 
	 */
	public void printMyNodes() {
		INode node=this.head;
		if(node!=null) {
			System.out.println("List: "+node.getKey());
			while((node=node.getNext())!=null) {
				System.out.println("->"+node.getKey());
			}
		}
    }
	
	public INode pop() {
		INode tempNode = head.getNext();
		this.head = head.getNext();  
		return tempNode;
	}
	
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}

	}
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
}
