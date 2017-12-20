package dataStructure.LinkedList;

public class LinkedList extends LinkedListAbsFunction {

	@Override
	public Node deleteNode(Node root, int value) {
		try {

			Node current = root;
			Node prev = root;

			while (current != null) {
				if (prev.data == current.data) {
					if (prev.data == value) {

						root = current.next;
						prev = null;

					} else {
						prev.next = current.next;
					}
				}

				prev = current;
				current = current.next;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return root;
	}

	@Override
	public Node insertNode(Node root, int value, int position) {
		try {
			Node tmp=root;
			Node newNode =new Node();
			newNode.next=null;
			newNode.data=value;
			
			if (tmp==null) {
				root=newNode;
			}
			else{
				
				while (tmp.next!=null) {
					tmp=tmp.next;
				}
				
				tmp.next=newNode;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return root;
		
	}

	@Override
	public void display(Node root) {
		while(root!=null){
			
			System.out.println(root.data);
			root=root.next;
		}

	}

	
	}
