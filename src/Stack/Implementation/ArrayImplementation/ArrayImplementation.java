package Stack.Implementation.ArrayImplementation;

public class ArrayImplementation {
    // Array / ArrayList Implementation
    public static class Stack {
        private int[] arr = new int[5]; //size of stack
        private int idx = 0; //starting index

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1]; //-1 bcz idx is pointing at the place where new element will be inserted
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            return idx==0;
        }

        boolean isFull(){
            return idx==arr.length-1;
        }

        int pop(){
            if(isEmpty()){ //can also use size==0
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            idx--;
            return top;
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        st.pop();
        st.size();
        st.display();
        System.out.println(st.size());
    }
}
