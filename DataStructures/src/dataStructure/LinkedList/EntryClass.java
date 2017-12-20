package dataStructure.LinkedList;

public class EntryClass {

	public static void main(String[] args) {
		
		
		//singly linked list
		int arraySingly[]={1,2,3,4};

		Node headSingle=null;
		LinkedList lls=new LinkedList();
		for (int i = 0; i < arraySingly.length; i++) {
			headSingle=lls.insertNode(headSingle, arraySingly[i], -1);
		}
		
		 
		//doubly linked list
				int arrayDoubly[]={1,2,3,4};

				DoublyLinkedListNode headDoubly=null;
				DoublyLinkedList lld=new DoublyLinkedList();
				for (int i = 0; i < arrayDoubly.length; i++) {
					headDoubly=lld.insert(headDoubly, arrayDoubly[i]);
				}
				
		
	}

}
