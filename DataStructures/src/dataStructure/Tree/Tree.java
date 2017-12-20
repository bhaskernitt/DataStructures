package dataStructure.Tree;

public class Tree extends TreeAbstractFunction{

	@Override
	public void display(Node root) {
		if(root==null){
			
			return;
		}
		
		
		System.out.println(root.data);
		display(root.left);
		display(root.right);
	}

	

	@Override
	public Node insertNode(Node root, int value) {
		
		
		if(root==null){
			
			root=new Node(value);
			
		}
		
		else if(root.data<value){
			
			root.right=insertNode(root.right,value);
		}
		else{
			
			root.left=insertNode(root.left,value);
		}
		
		return root;
	}

	

	@Override
	public Node lowestCommonAncestor(Node root,int n1,int n2) {
		
		if(root==null){
			return root;
		}
		if(n1<root.data && n2<root.data){
			lowestCommonAncestor(root.left,n1,n2);
		}
		else if(n1>root.data && n2>root.data){
			lowestCommonAncestor(root.right,n1,n2);
		}
		
		return root;
	}
	
	
	

}
