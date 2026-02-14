package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.Arrays;

//leetcode 354
public class RussianDollEnvelope {

    // This solution will give TLE on leetcode , bcz we will do it later in Greedy, but understand the concept here
    //further we will learn to find LIS using Binary Search and we will get the LIS in nlogn, right now using
    // tabulation it take n^2 to find LIS

    //Step 1: sort on the basis of 1st ele of 2D array, (we can also sort on the basis of 2nd ele)
    //Step 2: now sort the 2nd element in descending order
    // Now where 1st ele is same then the sort will happen as per the second ele in desc order
    // Now we can find the LIS on the second ele and we will get the ans
    // bcz equal length or breadth can come inside each other, so when 1st ele is same the sorting in desc order
    // as per the second ele, we will get them in an order that we can find the ans with Longest Increasing Subsequence.
    // without any clash of same width or height

    //making a user define data type
    public class Envelop implements Comparable<Envelop>{
        int w; //width
        int h; //height

        Envelop(int w, int h){
            this.w = w;
            this.h = h;
        }

        public int compareTo(Envelop e){
            //when width are equal
            if(this.w == e.w) return e.h - this.h; // sort in descending order, on the basis of height

            return this.w - e.w; //sort in ascending order, on the basis on width
        }
    }

    public int maxEnvelopes(int[][] envelopes){ //[width][height]
        int n = envelopes.length;
        Envelop[] arr = new Envelop[n];

        for(int i=0;i<n;i++){
            int w = envelopes[i][0];
            int h = envelopes[i][1];

            arr[i] = new Envelop(w,h);
        }

        Arrays.sort(arr); //custom sorting

        //now we have to apply LIS on arr.h
        int[] dp = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i-1;j++){
                if(arr[j].h < arr[i].h){
                    dp[i] = Math.max(dp[i],dp[j]);
                }
            }
            dp[i]++;
            max = Math.max(max,dp[i]);
        }
        return max;
    }

}
