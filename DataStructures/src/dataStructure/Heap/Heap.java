package dataStructure.Heap;

public class Heap implements IHeapAbs {

	int array[];
	int heap_size = 0;
	String heap_type;
	int capacity;

	public Heap(int capacity) {

		this.capacity = capacity;
		int[] rray = new int[capacity];
		this.array = rray;

	}

	@Override
	public int getMaximum(Heap heap) {

		if (heap.heap_size == 0)
			return -1;

		return heap.array[0];
	}

	@Override
	public int extractMax(Heap heap) {

		if (heap.heap_size <= 0)
			return Integer.MAX_VALUE;

		if (heap.heap_size == 1) {
			heap.heap_size--;
			return heap.array[0];

		}

		// stor the minimum value and remove it from heap
		int root = heap.array[0];
		heap.array[0] = heap.array[heap.heap_size - 1];
		heap.heap_size = heap.heap_size--;
		heapify(heap, 0);
		return root;
	}

	@Override
	public void insert(Heap heap, int data) {
		int i;

		if (heap.heap_size == heap.capacity) {

			reSizeHeap(heap);
		}
		heap.heap_size = heap.heap_size + 1;
		i = heap.heap_size - 1;

		heap.array[i] = data;

		while (i != 0 && heap.array[parent(heap, i)] < heap.array[i]) {
			int tmp;
			tmp = heap.array[i];
			heap.array[i] = heap.array[parent(heap, i)];
			heap.array[parent(heap, i)] = tmp;

		}

	}

	@Override
	public int deleteMax(Heap heap) {

		int data;

		if (heap.heap_size == 0)
			return -1;

		data = heap.array[0];
		heap.array[0] = heap.array[heap.heap_size - 1];
		heap.heap_size = heap.heap_size - 1;
		heapify(heap, 0);

		return data;
	}

	@Override
	public void decreaseKey(Heap heap) {
		// TODO Auto-generated method stub

	}

	@Override
	public int parent(Heap heap, int child) {
		if ((child - 1) / 2 >= heap.heap_size || child <= 0)
			return -1;

		return (child - 1) / 2;
	}

	@Override
	public int left(Heap heap, int root) {

		if (root * 2 + 1 >= heap.heap_size || root <= 0)
			return -1;

		return root * 2 + 1;
	}

	@Override
	public int right(Heap heap, int root) {
		if (root * 2 + 1 >= heap.heap_size || root <= 0)
			return -1;

		return root * 2 + 2;
	}

	@Override
	public void heapify(Heap heap, int root) {

		int l, r, tmp, max;
		l = left(heap, root);
		r = right(heap, root);

		if (l != -1 && heap.array[l] > heap.array[root]) {

			max = l;
		} else
			max = r;

		if (r != -1 && heap.array[r] > heap.array[max]) {

			max = r;
		}
		
		if(max!=root){
			
			tmp=heap.array[root];
			heap.array[root]=heap.array[max];
			heap.array[max]=tmp;
			heapify(heap, max);
			
		}

	}

	@Override
	public void reSizeHeap(Heap heap) {

		int array[] = new int[heap.capacity * 2];
		for (int i = 0; i < heap.capacity; i++) {
			array[i] = heap.array[i];
		}

		heap.array = array;

	}

}
