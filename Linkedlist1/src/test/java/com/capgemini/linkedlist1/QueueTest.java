package com.capgemini.linkedlist1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 *
 */
public class QueueTest {

	@Test
	public void addedToLast() {
		Queue myQueue = new Queue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printQueue();
		assertEquals((int)myThirdNode.getKey(), 70);
	}
	
	/**
	 * 
	 */
	@Test
	public void removeFirstNode() {
		Queue myQueue = new Queue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.dequeue();
		assertEquals((int)myFirstNode.getKey(), 56);
		}

}