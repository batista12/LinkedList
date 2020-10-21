package com.capgemini.linkedlist1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
		Stack myStack = new Stack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		myStack.printStack();
		assertEquals(myThirdNode, myNode);
	}
	
	@Test
	public void given3Numbers_WhenPopped_ShouldMatchLastAddedNode() {
		Stack myStack = new Stack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.pop();
		assertEquals(myThirdNode, myNode);
		System.out.print(myNode.getKey());
		myStack.printStack();
	}
	
	@Test
	public void given3Numbers_WhenPeeked_ShouldReturnLastAddedNode() {
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
