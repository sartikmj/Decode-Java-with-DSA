package Queue.Implementation.ArrayImplimentation;

public class ArrayImplementation {

    public static class Queue{
        int f = -1; //front pointer for queue
        int r = -1; //rear pointer for queue
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
            //Checking Overflow Condition
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            //if it is the first element to be inserted then first we will point both r and f at index 0, and then add the element
            if(f==-1 && r==-1){
                r=f=0;
                arr[r] = val;
            }
            else{ //if it is not the first element in the queue
                arr[++r] = val;
            }
            size++;
        }

        public int remove(){
            //Checking Underflow condition
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }

        public int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println(q.isEmpty());

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();
        System.out.println();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.remove());
        System.out.println();
        System.out.println(q.isEmpty());
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}
