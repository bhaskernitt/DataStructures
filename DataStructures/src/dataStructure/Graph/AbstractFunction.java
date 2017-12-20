package dataStructure.Graph;

public abstract class AbstractFunction {
	public abstract void display(VertexNode vertextNode);
	public abstract VertexNode createVertex(String valueVertex,String ValueEdge,VertexNode head);
	public abstract void addEdge(VertexNode NodeVertex,String ValueEdge);
	public abstract EdgeNode createEdge(EdgeNode NodeVertex,String valueEdge);
	

}
