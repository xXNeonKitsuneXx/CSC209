public class Heap {
    int[] heap;
    int size;

    public Heap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public Heap() {
        this(100);
    }

    public boolean isEmpty() {
        return (size == 0); //() Get true or false
    }

    public boolean isFull() {
        return (size >= heap.length); //() Get true or false
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public void enqueue(int newInfo) {
        if (!isFull()) {
            heap[size] = newInfo;
            int newValueIndex = size;
            size++;
            int parentIndex = (newValueIndex - 1) / 2;
            // Move up

            while (newValueIndex > 0 && heap[parentIndex] < heap[newValueIndex]) {
                // Swap
                int temp = heap[newValueIndex];
                heap[newValueIndex] = heap[parentIndex];
                heap[parentIndex] = temp;
                newValueIndex = parentIndex;
                parentIndex = (newValueIndex - 1) / 2;
            }
        } else {
            System.out.println("Heap is full.");
        }
    }

    public int dequeue()
    {
        int root;
        if(!isEmpty())
        {
            root = heap[0];
            int lastElement = heap[size - 1];
            heap[0] = lastElement;
            size--;

            // Move down from root
            int lastElementIndex = 0;
            int leftChildOfLastElement = (lastElementIndex*2) + 1;
            int rightChildOfLastElement = (lastElementIndex*2) + 2;
            while (leftChildOfLastElement < size && heap[lastElementIndex] < heap[leftChildOfLastElement]
                    ||
                    (rightChildOfLastElement < size && heap[lastElementIndex] < heap[rightChildOfLastElement]))
            {
                int swapIndex ;
                if(heap[leftChildOfLastElement] == size - 1) {
                    swapIndex = leftChildOfLastElement;
                }
                else if (heap[leftChildOfLastElement] > heap[rightChildOfLastElement]) {
                    swapIndex = leftChildOfLastElement;
                }
                else {
                    swapIndex = rightChildOfLastElement;
                }

                // Swap
                int temp = heap[lastElementIndex];
                heap[lastElementIndex] = heap[swapIndex];
                heap[swapIndex] = temp;
                lastElementIndex = swapIndex;
                leftChildOfLastElement = (lastElementIndex*2) + 1;
                rightChildOfLastElement = (lastElementIndex*2) + 2;
            }
        }
        else {
            System.out.println("This heap is empty.");
            root = -1;
        }
        return root;
    }


    public void heapSort() {
        // Phase 1: Arrange the array into the heap structure
        // Phase 2: Sort the heap
        // No need to do phase 1 here because we already work on the heap
        for (int last = size - 1; last > 0; last--) {
            // Swap root with last
            int temp = heap[last];
            heap[last] = heap[0];
            heap[0] = temp;

            // Move down from root
            int lastElementIndex = 0;
            int leftChildOfLastElement = lastElementIndex*2 + 1;
            int rightChildOfLastElement = lastElementIndex*2 + 2;
            while ((leftChildOfLastElement < last && heap[lastElementIndex] < heap[leftChildOfLastElement])
                    ||
                    (rightChildOfLastElement < last && heap[lastElementIndex] < heap[rightChildOfLastElement]))
            {
                int swapIndex ;
                if(leftChildOfLastElement == last - 1) {
                    swapIndex = leftChildOfLastElement;
                }
                else if (heap[leftChildOfLastElement] > heap[rightChildOfLastElement]) {
                    swapIndex = leftChildOfLastElement;
                }
                else {
                    swapIndex = rightChildOfLastElement;
                }

                // Swap for moving down
                temp = heap[lastElementIndex];
                heap[lastElementIndex] = heap[swapIndex];
                heap[swapIndex] = temp;
                lastElementIndex = swapIndex;
                leftChildOfLastElement = (lastElementIndex*2) + 1;
                rightChildOfLastElement = (lastElementIndex*2) + 2;
            }
        }
    }
}
