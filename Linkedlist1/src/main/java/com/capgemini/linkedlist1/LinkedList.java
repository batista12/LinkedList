package com.capgemini.linkedlist1;

/**
 * @author ASUS
 * @param <K>
 *
 */
public class LinkedList<K> {
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
	
	/**
	 * @return
	 */
	public INode pop() {
		INode tempNode = head.getNext();
		this.head = head.getNext();  
		return tempNode;
	}
	
	/**
	 * @return
	 */
	public INode popLast(){
		INode tempNode=this.head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode=tempNode.getNext();
		}
		this.tail=tempNode;
		tempNode=tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
		
	}
	
	/**
	 * @param newNode
	 */
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
	/**
	 * @param myNode
	 * @param newNode
	 */
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	/**
	 * @param key
	 * @return
	 */
	public INode search(K key) {
		INode tempNode = head;
		while(tempNode!=null&&tempNode.getNext()!=null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			else 
				tempNode = tempNode.getNext();	
		}
		return null;
	}
	/**
	 * @param value
	 * @param newNode
	 */
	public INode insertAfter(K key, INode newNode) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				break;
			} else
				tempNode = tempNode.getNext();
		}
		INode tempNode2 = tempNode.getNext();
		tempNode.setNext(newNode);
		newNode.setNext(tempNode2);
		return tempNode;
}
}