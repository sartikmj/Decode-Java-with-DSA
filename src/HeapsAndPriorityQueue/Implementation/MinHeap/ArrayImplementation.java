package HeapsAndPriorityQueue.Implementation.MinHeap;


class MinHeap{
    private int[] arr; //arr.length -> Capacity of Array
    private int size; //-> Current size of heap

    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }

    //size tells the size of the Heap also tells where the next element inside the array will come in.

    //methods

    //Add
    //requires all the below 3 methods
    public void add(int num) throws Exception{
        if(size == arr.length){
            throw new Exception("Heap is full!");
        }
        //add element at the size th index
        arr[size] = num;
        size++;

        upheapify(size-1); //we will pass the index at which the element just have been added
    }

    public void upheapify(int index){
        if(index==0) return; //base case
        int parent = (index-1)/2; //(child-1)/2
        if(arr[index] < arr[parent]){
            swap(index,parent);
            upheapify(parent); //now the child is at the index of parent
        }
    }

    public void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Peek
    public int peek() throws Exception{
        if(size==0){ //bcz by default array has 0, so it will give 0 which is wrong to handle that we have this.
            throw new Exception("Heap is Empty");
            //OR can do this
//            System.out.println("Heap is Empty");
//            return -1;
        }
        return arr[0];
    }

    //remove element (topmost)
//    1. swap first and last ele i.e, 0 and size-1
//    2. size-- , removes the current last ele
//    3. down heapify , if the child or children of root is lesser than it , then swap it with smaller child
//    4. keep doing it until
    public int remove() throws Exception{
        if(size==0) throw new Exception("Heap is empty!");
        int peek =  arr[0];
        swap(0,size-1);
        size--;
        downheapify(0);
        return peek;
    }
    public void downheapify(int index){ //index of top most

        if(index>=size-1) return;

        int lc = index*2+1; //left child
        int rc = index*2+2; //right child
        int minIdx = index;

        if(lc<size && arr[lc] < arr[minIdx]){
            minIdx = lc;
        }

        if(rc<size && arr[rc] < arr[minIdx]){
            minIdx = rc;
        }
        if(index ==  minIdx) return; //If the current node is already smaller than both its children (i.e., it's already in the correct position)
        swap(index, minIdx);

        downheapify(minIdx); //now the child is at the index of parent
    }

    public int size(){
        return size;
    }

}

public class ArrayImplementation {

//    Heap is implemented by Array and visualized as a Complete Binary Tree with Heap Order Property
//
//    Left Child(index) = 2*p+1
//    Right Child = 2*p+2
//    p-> index of Parent.
//
//    -------------IMPORTANT------------------
//    p = (c-1)/2, c can be left or right child.

    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);
//        pq.peek();
//        System.out.println(pq.peek());
        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.add(0);
        pq.add(-4);
        System.out.println(pq.size());
        System.out.println(pq.peek());

    }

}
