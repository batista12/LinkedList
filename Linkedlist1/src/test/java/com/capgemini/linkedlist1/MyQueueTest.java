package com.capgemini.linkedlist1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyQueueTest {

		@Test
		public void given3Numbers_WhenEnqueued_ShouldHaveAddedToLast() {
			Queue myQueue = new Queue();
			MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
			MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
			MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
			myQueue.enqueue(myFirstNode);
			myQueue.enqueue(mySecondNode);
			myQueue.enqueue(myThirdNode);
			myQueue.printQueue();
			assertEquals((int)myThirdNode.getKey(), 70);
			myQueue.dequeue();
			myQueue.printQueue();
		}

}