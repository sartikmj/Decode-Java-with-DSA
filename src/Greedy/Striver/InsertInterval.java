package Greedy.Striver;

import java.util.ArrayList;
import java.util.List;

//leetcode 57
public class InsertInterval {

    //TC=O(N) SC=O(N)
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        //for left intervals
        int i=0;
        while(i < n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        //for overlapping part
        while( i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        //for right intervals
        while(i<n){
            res.add(intervals[i]);
            i++;
        }

        int[][] ans = new int[res.size()][2];

        for(int j=0;j<res.size();j++){
            ans[j] = res.get(j);
        }

        return ans;
    }
}
