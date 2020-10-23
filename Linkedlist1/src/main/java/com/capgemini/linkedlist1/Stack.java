package com.capgemini.linkedlist1;

/**
 * @author ASUS
 *
 */
public class Stack {
	private final LinkedList myLinkedList;

	public Stack() {
		this.myLinkedList = new LinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peek() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public INode peak() {
		return myLinkedList.head;
	}

