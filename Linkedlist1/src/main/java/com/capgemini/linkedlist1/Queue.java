package com.capgemini.linkedlist1;
/**
 * 
 *
 */
public class Queue {
	private final LinkedList myLinkedList;

	public Queue() {
		this.myLinkedList = new LinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	public INode dequeue() {
		return myLinkedList.pop();
	}
}
