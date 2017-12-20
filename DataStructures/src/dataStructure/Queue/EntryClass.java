package dataStructure.Queue;


public class EntryClass {

	public static void main(String[] args) {
		
		
		Queue q1=new Queue();
		q1.enqueue(10);
		q1.enqueue(11);
		
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		
		
		
	}

}
