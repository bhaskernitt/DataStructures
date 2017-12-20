package dataStructure.AVLTree;

public abstract class AVLTreeAbstractFunctions {
	
	public abstract AVLNode createAVLNode(int data);
	public abstract void LevelOrderTravesal(AVLNode root);
	public abstract AVLNode insert(AVLNode root,int data);
	public abstract int height(AVLNode root);
	public abstract int balanceFactor(AVLNode root);
	
	public abstract AVLNode rightRight_left_Rotation(AVLNode root);
	public abstract AVLNode leftleft_right_Rotation(AVLNode root);
	

}
