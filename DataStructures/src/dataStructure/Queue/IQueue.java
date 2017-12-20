package dataStructure.Queue;

public interface IQueue {
	
	public void enqueue(int value);
	public int dequeue();
	
	public boolean isQueueEmpty();
	public boolean isQueueFull();
	
	public int peek();
	

	

}
