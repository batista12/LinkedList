package com.capgemini.linkedlist1;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

	/**
	 * 
	 */
	@Test
	public void returnLastNode() {
		Stack myStack = new Stack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		assertEquals(myThirdNode, myNode);
		System.out.println(myNode.getKey());
	}
}
