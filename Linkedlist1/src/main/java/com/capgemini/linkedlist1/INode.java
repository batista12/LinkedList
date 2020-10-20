package com.capgemini.linkedlist1;

/**
 * @author ASUS
 *
 * @param <K>
 */
public interface INode<K> {
	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode next);
}
