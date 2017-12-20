package dataStructure.LinkedList;

public class DoublyLinkedList extends DoublyLinkedListAbsFunction {

	@Override
	public DoublyLinkedListNode insert(DoublyLinkedListNode head, int value) {
		
		DoublyLinkedListNode newNode =new DoublyLinkedListNode();
		newNode.data=value;
		if(head==null){
			head=newNode;
			
		}
		else{
		DoublyLinkedListNode tmp=head;
		while (tmp.next!=null) {
			tmp=tmp.next;
			
		}
		
		tmp.next=newNode;
		newNode.prev=tmp;
		}
		
		return head;
	}

}
