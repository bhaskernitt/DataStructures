package dataStructure.Tree;

public class EntryMain {

	public static void main(String[] args) {
		int array[]={6,2,5,4,9,6};
		
		Node root=null;
		Tree tree=new Tree();
		
		for (int i = 0; i < array.length; i++) {
			root=tree.insertNode(root, array[i]);
		}
		
		
		tree.display(root);
	}

}
