package com.capgemini.linkedlist1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ASUS
 *
 */
public class MyLinkedListTest {

	/**
	 * 
	 */
	@Test
	public void linkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	/**
	 * 
	 */
	@Test
	public void appendedToLinkedList() {
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		LinkedList myLinkedList = new LinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		assertEquals(true, result);
	}

	/**
	 * 
	 */
	@Test
	public void insertingNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList myLinkedList = new LinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		assertEquals(true, result);
	}

	/**
	 * 
	 */
	@Test
	public void deletingNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList myLinkedList = new LinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		MyNode<Integer> poppedelement = (MyNode<Integer>) myLinkedList.pop();
		assertEquals(mySecondNode, poppedelement);
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		assertEquals(true, result);
	}
	/**
	 * 
	 */
	@Test
	public void deletingLastNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList myLinkedList = new LinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		MyNode<Integer> popLast = (MyNode<Integer>) myLinkedList.popLast();
		myLinkedList.printMyNodes();
		assertEquals(myThirdNode, popLast);
		myLinkedList.printMyNodes();
	}
}