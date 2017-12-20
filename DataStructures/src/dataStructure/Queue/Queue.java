package dataStructure.Queue;

import dataStructure.Stack.StackNode;

public class Queue implements IQueue {

	private QueueNode head;
	private int capacity;
	
	public Queue(){
		
		this.capacity=100;
		this.head=null;
	}
	
	
	@Override
	public void enqueue(int value) {
		if(isQueueFull()){
			System.out.println("Queue is full");
			return;
		}
		
		QueueNode newNode=new QueueNode();
		newNode.data=value;
		newNode.next=null;
		if(this.head==null){
			this.head=newNode;
		}
		else{
			QueueNode tmp=this.head;
			

			while(tmp.next!=null){
				tmp=tmp.next;
				
			}
			tmp.next=newNode;
			
			
		}
	
		this.capacity=this.capacity+1;
	}

	@Override
	public int dequeue() {
		if(isQueueEmpty()){
			
			System.out.println("Queue is Empty");
		return -1;
		}
		
		int val=this.head.data;
		this.head=this.head.next;
		return val;
	}

	@Override
	public boolean isQueueEmpty() {
		if(this.head==null){return true;}
		return false;
	}

	@Override
	public boolean isQueueFull() {
		
		if(this.capacity==Integer.MAX_VALUE){return true;}
		return false;
	}

	@Override
	public int peek() {
		
		return this.head.data;
	}

	}
