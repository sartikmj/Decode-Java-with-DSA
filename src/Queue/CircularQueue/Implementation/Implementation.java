package Queue.CircularQueue.Implementation;

public class Implementation {

    public static class Queue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        int n = arr.length;

        public void add(int val) {
            if (size == 0) {
                f = r = 0;
                arr[f] = val;
            } else if (size == n) {
                System.out.println("Queue is full");
            } else if (r < n - 1) { //normal case
                r++;
                arr[r] = val;
            }

            //Remember, size is not full we have already checked that condition above i.e., front has moved further than 0 and rear can go to zero
            else if (r == n - 1) { //the rear is at the end of the array, and there is space left in the front of the array
                r = 0;
                arr[r] = val;
            }
            size++;
        }

        //Remember, size is not full we have already checked that condition above i.e., rear has moved further than 0 and the front can go to zero
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            } else {
                int val = arr[f];
                if (f == arr.length - 1) { //if f is at the end of the array
                    f = 0;
                } else {
                    f++;
                }
                size--;
                return val;
            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            } else {
                return arr[f];
            }
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            if (f < r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else { // f > r
                for (int i = f; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i <= r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();


        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.remove());
        q.add(5);
        q.add(6);
        System.out.println(q.size);

        q.display();
        q.add(7);
    }
}
