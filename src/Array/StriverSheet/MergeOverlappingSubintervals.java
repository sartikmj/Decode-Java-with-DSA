package Array.StriverSheet;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MergeOverlappingSubintervals {

    //Brute
    // TC=O(nlogn) SC=O(n)
    public int[][] mergeBrute(int[][] intervals) {

        //sorting the array, by the starting interval if the first is same then sort by the ending interval

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> list = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        //loop through intervals
        while(i<n){
            //start of merged interval
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i+1;

            //now check all overlapping intervals
            while(j<n && intervals[j][0] <= end){
                //Extend the end of current interval
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            //Add merged interval to result
            list.add(Arrays.asList(start,end));

            //Move to next overlapping interval
            i=j;
        }

        int[][] ans = new int[list.size()][2];

        for(i=0;i<ans.length;i++){ // i is already defined above
            for(int j=0;j<=1;j++){
                ans[i][j] = list.get(i).get(j);
            }
        }

        return ans;
    }

    //Optimal


    public static void main(String[] args) {

    }
}
