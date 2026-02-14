package Queue.Questions;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class RevealCardsInIncreasingOrder {
//    Leetcode 950

//    Approach
//    1. sort the array
//    2.make a result array
//    3.make a queue, where we will store the indexes of the resultant array
//    4.we will take the first ele of queue i.e., 0 and in res array at index 0 put the value as per the given array one by one
//    5. then for the next val inside queue we will poll at add at the end of the queue
//    Repeat it n times
//    NOTE: in res array store the value at the same index found at queue

//    TC=O(NLOGN) bcz time complexity of arrays.sort is nlogn.
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(i);
        }
        int[] res = new int[n];

        for(int i=0;i<n;i++){ //for iterating on a sorted array
            res[q.poll()] = deck[i];
            q.add(q.poll());
        }

        return res;
    }
}
