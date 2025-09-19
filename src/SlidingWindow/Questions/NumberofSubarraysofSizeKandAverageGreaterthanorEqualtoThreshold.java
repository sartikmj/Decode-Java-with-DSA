package SlidingWindow.Questions;

// you can also do brute force ny N2 TC, checking all the subarrays.

//Leetcode 1343
public class NumberofSubarraysofSizeKandAverageGreaterthanorEqualtoThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,j = k-1,n = arr.length,avg=0,sum=0,count=0;
        for(int a=0;a<=j;a++){
            sum += arr[a];
        }
        avg = sum/k;
        if(avg>=threshold) count++;
        i++;j++;
        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            avg = sum/k;
            if(avg>=threshold) count++;
            i++;j++;
        }
        return count;
    }
}
