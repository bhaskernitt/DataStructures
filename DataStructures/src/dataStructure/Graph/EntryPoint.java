package dataStructure.Graph;

public class EntryPoint {

	public static void main(String[] args) {
		
		String[]arrayNode={"A","B","C","D","E","F","G","H"};
		
		String []arrayEdge={"A C E B","B A E D","C A D","D A B","E A B C","F A C D E","G ","H D F A" };
		
		VertexNode head=null;
		
		Graph graph=new Graph();
		
		for (int i = 0; i < arrayNode.length; i++) {
			
			head=graph.createVertex(arrayNode[i], arrayEdge[i], head);
			
		}
		
		graph.display(head);
	}

}
