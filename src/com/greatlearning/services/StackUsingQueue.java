package com.greatlearning.services;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> queue;
	Queue<Integer> tempQueue;
	public StackUsingQueue() {
		queue = new LinkedList<Integer>();
		tempQueue = new LinkedList<Integer>();
	}
	//push
	//pop
	//isEmpty
	public void push(int data) {
		
		//if no elements is present
		if(queue.size()==0)
		queue.add(data);
		else {
			int size = queue.size();
			for(int i =0;i<size ;i++) {
				tempQueue.add(queue.remove());
			}
			queue.add(data);
			for(int i =0;i< size;i++) {
				queue.add(tempQueue.remove());
			}
		}
	}
	
	public int pop() {
		if(queue.size()==0)
			throw new NoSuchElementException("Underflow Exception");
		return queue.remove();
	}
	
	public boolean isEmpty() {
		return queue.size()==0;
	}
	
	public int getSize() {
		return queue.size();
	}
	
	public void display() {
		System.out.println("Stack = ");
		int size = queue.size();
		if(size==0)
			System.out.println("Empty");
		else {
			Iterator itr = queue.iterator();
			while(itr.hasNext())
				System.out.println(itr.next()+ " ");
			System.out.println();
		}
	}
}
