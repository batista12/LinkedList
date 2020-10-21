package com.capgemini.linkedlist1;

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

}