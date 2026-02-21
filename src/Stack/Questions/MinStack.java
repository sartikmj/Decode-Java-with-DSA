package Stack.Questions;
import java.util.Stack;
public class MinStack {
    //leetcode 155

    //Fine Approach

    //we will use another stack minstack to store the minimum value of the stack
    //and keep push the min value at the moment
    //when pop we will pop from both together

//    Stack<Integer> st = new Stack<>();
//    Stack<Integer> minst = new Stack<>(); //extra stack O(n)
//    public MinStack() {
//        //Constructor
//    }
//
//    public void push(int val) {
//        if(st.isEmpty()){
//            st.push(val);
//            minst.push(val);
//        }
//        else if(val<minst.peek()){
//            st.push(val);
//            minst.push(val);
//        }
//        else{
//            minst.push(minst.peek());
//            st.push(val);
//        }
//    }
//
//    public void pop() {
//        st.pop();
//        minst.pop();
//    }
//
//    public int top() {
//        return st.peek();
//    }
//
//    public int getMin() {
//        return minst.peek();
//    }


    //Better Approch

//   For explanation watch video
//
//    Stack<Integer> st = new Stack<>();
//    int min = 0;
//    public MinStack() {
//        //constructor
//    }
//
//    public void push(int val) {
//        if(st.isEmpty()){
//            st.push(val);
//            min=val;
//        }
//        else if(val>=min) st.push(val);
//        else if(val<min){
//            st.push(2*val-min);
//            min = val;
//        }
//    }
//
//    public void pop() {
//        if(st.isEmpty()) return;
//        if(st.peek()>=min) st.pop();
//        else if(st.peek()<min){ //peek p fake value padi hai
//            //restore the old min
//            int old = 2*min - st.peek();
//            min = old;
//            st.pop();
//        }
//    }
//
//    public int top() {
//        if(st.isEmpty()) return -1;
//        if(st.peek()>=min) return st.peek();
//        if(st.peek()<min){ //farzi value
//            return min; //min is actually that value
//        }
//        return 0;
//    }
//
//    public int getMin() {
//        if(st.isEmpty()) return -1;
//        return min;
//    }

//    Optimal Approach

//    we push x on the stack.
//    if x <= curr min , we push curr min again on the stack first , then we will push x in the stack
//    if we pop current top most element y which is right now the current min ,
//    at this time we will have to update curr min
//    so we maintain prev min every time

//    if pop is removing current min,
//    we pop twice and change current min to 2nd pop value, as it is the prev min value


//    initially we will take min as Integer.MAX_VALUE

//    TC=O(1) SC=O(N)

    int min;
    Stack<Integer> st;
    public MinStack() {
        min = Integer.MAX_VALUE;
        st = new Stack<>();
    }

    public void push(int val) {
        if(val<=min){
            st.push(min);
            min = val;
        }
        st.push(val);
    }

    public void pop() {
        if(st.pop()==min){
            min=st.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min;
    }



}


