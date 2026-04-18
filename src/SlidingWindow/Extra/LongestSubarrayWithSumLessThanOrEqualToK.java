package SlidingWindow.Extra;

import java.util.ArrayList;

public class LongestSubarrayWithSumLessThanOrEqualToK {

    public static void method(int[] arr, int k){

        if(arr.length==0){
            System.out.println("Array is empty");
            return;
        }


        int i=0;
        int j=0;
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        while(j<n){

            sum+=arr[j];

            if(sum<=k){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }
            else{
                sum-=arr[i];
                i++;
            }
        }

        System.out.println("Max length is "+maxLen);
    }

    public static void main(String[] args) {

        int[] arr = {};
        int k=2;

        method(arr,k);
    }
}
