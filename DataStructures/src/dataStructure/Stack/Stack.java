package dataStructure.Stack;

public class Stack  implements IStackMethods{
	
	private int capacity;
	private StackNode head;
	public Stack(){
		this.capacity=100;
		this.head=null;
		
	}
	@Override
	public void push(int value) {
		if(isStackFull()){
			System.out.println("stack is full");
			return;
		}
		
		StackNode newNode=new StackNode();
		newNode.data=value;
		newNode.next=null;
		if(this.head==null){
			this.head=newNode;
		}
		else{
			
			newNode.next=this.head;
			this.head=newNode;
		}
	
		this.capacity=this.capacity+1;
	}
	@Override
	public int pop() {
		if(isStackEmpty()){
			
			System.out.println("Stack is Emply");
		return -1;
		}
		
		int val=this.head.data;
		this.head=this.head.next;
		return val;
	}
	@Override
	public boolean isStackEmpty() {
		if(this.head==null){return true;}
		return false;
	}
	@Override
	public boolean isStackFull() {
		
		if(this.capacity==Integer.MAX_VALUE){return true;}
		return false;
	}
	@Override
	public int peek() {
		return this.head.data;
	}

}
