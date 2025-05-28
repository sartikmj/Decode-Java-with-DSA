package Stack.Questions.YoutTubeLoveBabbar;//{ Driver Code Starts

class twoStacks {
    int[] arr;
    int size;
    int t1,t2;

    twoStacks() {
        size=100;
        arr = new int[size];
        t1=-1;
        t2=size;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here

        if(t2-t1 > 1){
            t1++;
            arr[t1] = x;
        }

    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        if(t2-t1>1){
            t2--;
            arr[t2] = x;

        }

    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(t1>=0){
            int x = arr[t1];
            t1--;
            return x;
        }

        return -1;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(t2<size){
            int x = arr[t2];
            t2++;
            return x;
        }
        return -1;
    }
}
