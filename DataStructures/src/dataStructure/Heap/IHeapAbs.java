package dataStructure.Heap;

public interface IHeapAbs {
	
	public int getMaximum(Heap heap);
	public int extractMax(Heap heap);
	public void insert(Heap heap,int data);
	
	public int deleteMax(Heap heap);
	
	public void decreaseKey(Heap heap);
	
	public int parent(Heap heap,int child);
	public int left(Heap heap,int root);
	public int right(Heap heap,int root);
	
	public void heapify(Heap heap,int root);
	
	public void reSizeHeap(Heap heap);
	
	
	

}
