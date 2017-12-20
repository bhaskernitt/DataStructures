package dataStructure.AVLTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree extends AVLTreeAbstractFunctions {

	@Override
	public AVLNode createAVLNode(int data) {
		
		return new AVLNode(data);
	}

	@Override
	public void LevelOrderTravesal(AVLNode root) {
		if (root==null) {
			return;
		}
		
		Queue<AVLNode> q=new LinkedList<AVLNode>();
		q.add(root);
		
		int count=-1;
		
		while (true) {
			
			if(q.size()==0){
				
				break;
			}
			
			
			count=q.size();
			
			while(count-->0){
				
				System.out.println("\t"+q.peek().data+" ");
				if(q.peek().Left!=null)
				{
					q.add(q.peek().Left);
				}
				
				if(q.peek().Right!=null)
				{
					q.add(q.peek().Right);
				}
				
				q.poll();
				
				
			}
			System.out.println();
			
		}
		
		
		
	}

	@Override
	public AVLNode insert(AVLNode root, int data) {
		
		if (root == null) {
			
			return createAVLNode(data);
		}
		
		if (root.data > data) {
			root.Left=insert(root.Left,data);
		}
		else{
			
			root.Right=insert(root.Right, data);
		}
		
		
		root.height=1+Math.max(height(root.Right), height(root.Left));
		
		
		
		int bf=balanceFactor(root);
		
		if (bf>1 && data <root.Left.data) {
			return leftleft_right_Rotation(root);
		}
		
		if (bf > 1 && data > root.Left.data) {
			root.Left=rightRight_left_Rotation(root.Left);
			return leftleft_right_Rotation(root);
		}
		if(bf< -1 && data >root.Right.data){
			
			return rightRight_left_Rotation(root);
		}
		
		if(bf <-1 && data <root.Right.data){
			root.Right=leftleft_right_Rotation(root.Right);
			return rightRight_left_Rotation(root);
			
		}
		
		return root;
	}

	@Override
	public int height(AVLNode root) {
		if(root==null){
			return 0;
		}
		return root.height;
	}

	@Override
	public int balanceFactor(AVLNode root) {
		if(root==null){
			return 0;
		}
		return height(root.Left)- height(root.Right);
	}

	@Override
	public AVLNode rightRight_left_Rotation(AVLNode root) {
		
		AVLNode rootRight=root.Right;
		AVLNode rootRightLeft=rootRight.Left;
		
		root.Right=rootRightLeft;
		rootRight.Left=root;
		
		root.height=Math.max(height(root.Left), height(root.Right)+1);
		rootRight.height=Math.max(height(rootRight.Right), height(rootRight.Right)+1);
		
		return rootRight;
	}

	@Override
	public AVLNode leftleft_right_Rotation(AVLNode root) {
		
		AVLNode x=root.Left;
		AVLNode T2=x.Right;
		
		x.Right=root;
		root.Left=T2;
		
		root.height=Math.max(height(root.Left), height(root.Right)+1);
		x.height=Math.max(height(x.Right), height(x.Right)+1);
		
		return x;
	}

}
