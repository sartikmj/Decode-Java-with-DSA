package Greedy.Striver;

import java.util.Arrays;

//leetcode 435
public class NonOverlappingIntervals {

    //Reframe question: Maximum Number of meeting that can be held in a single room
    // then minus it from the total number of intervals you will get the number of intervals to be removed

    //TC=O(NlogN + N) SC=O(1)
    public int eraseOverlapIntervals(int[][] intervals) {
        //sorting with respect to the ending time

        Arrays.sort(intervals, (a, b) -> a[1]-b[1]); //using comparator
        int count = 1;
        int lastEndTime = intervals[0][1];

        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0] >= lastEndTime){
                count++;
                lastEndTime = intervals[i][1];
            }
        }

        return intervals.length - count;
    }
}
