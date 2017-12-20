package dataStructure.Graph;

public  class Graph extends AbstractFunction{

	@Override
	public void display(VertexNode vertextNode) {
		for (; vertextNode !=null; vertextNode=vertextNode.nextVertex) {
			
			System.out.println("vertex is "+vertextNode.Vertex+"\n");
			for (EdgeNode j =vertextNode.edge ; j !=null; j=j.next) {
				System.out.println("Edge is "+vertextNode.edge.edge);
				vertextNode.edge=vertextNode.edge.next;
			}
		}
		
	}

	@Override
	public VertexNode createVertex(String valueVertex, String ValueEdge, VertexNode head) {
		
		VertexNode newNode=new VertexNode();
		newNode.nextVertex=null;
		newNode.Vertex=valueVertex;
		VertexNode tmp=head;
		if(tmp==null){
			head=newNode;
			tmp=head;
		}
		else{
			
			while (tmp.nextVertex!=null) {
				tmp=tmp.nextVertex;
				
			}
			
		}
		
		while(tmp.nextVertex!=null){
			tmp=tmp.nextVertex;
		}
		addEdge(tmp,ValueEdge);
		
		return head;
		
	}

	@Override
	public void addEdge(VertexNode NodeVertex, String ValueEdge) {
		String []array=null;
		array=ValueEdge.split(" ");
		EdgeNode tmp=null;
		for (int i = 1; i < array.length; i++) {
			tmp=createEdge(tmp, array[i]);
		}
		
		NodeVertex.edge=tmp;
	}

	@Override
	public EdgeNode createEdge(EdgeNode NodeVertex, String valueEdge) {
		
		EdgeNode newNode=new EdgeNode();
		newNode.next=null;
		newNode.weight=1;
		newNode.edge=valueEdge;
		
		EdgeNode tmp=NodeVertex;
		
		if(NodeVertex==null){
			NodeVertex=newNode;
		}
		else{
			
			while(tmp.next!=null){
				tmp=tmp.next;
			}
			tmp.next=newNode;
		}
		
		return NodeVertex;
	}

}
