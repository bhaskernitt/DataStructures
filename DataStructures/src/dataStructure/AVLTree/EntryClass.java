package dataStructure.AVLTree;

public class EntryClass {

	public static void main(String[] args) {
		
		int array[]={1,2,3,4,5,6,7,8,9,867};
		AVLNode root=null;
		
		AVLTree avltree=new AVLTree();
		for (int i = 0; i < array.length; i++) {
			root=avltree.insert(root, array[i]);
		}

		avltree.LevelOrderTravesal(root);
	}

}
