package Queue.Questions;

import java.util.*;

//leetcode 649
public class Dota2Senate {


    //  Approach
//  We will make two queues R and D, both for storing indexes of R and D in the string
//  Now we will compare indexes stored in queue,
//  The larger element will be removed, while the smaller element will be sent to the last of its respective queue with the new index i.e., n++
//  we will keep doing this until one queue is empty
//  if one queue is null, the other queue will be declared winner, and return its respective name

//    TC=O(N)
    public static String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();
        int n = senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                R.add(i);
            }
            else{
                D.add(i);
            }
        }

        while( !R.isEmpty() && !D.isEmpty() ){
            if(R.peek() < D.peek()){
                R.add(n++);
            }
            else{
                D.add(n++);
            }
            R.poll();
            D.poll();
        }

        return R.isEmpty()?"Dire":"Radiant";
    }

    public static void main(String[] args) {

    }
}
