package SlidingWindow.Questions;

public class LongestSubarrayof1sAfterDeletingOneElement {

    //Brute Force, exactly like previous questions

    //Sliding Window
    public int longestSubarray(int[] arr) {
        int i=0,j=0,n=arr.length;
        int zeroes = 0, maxLen = 0;

        int z=0;
        for(int ele : arr){
            if(ele==0) z++;
        }
        if(z==0) return n-1; // I am removing a '1', if there are no zeroes in the array, All elements are 1.
        //we will pass all the initial zeroes, as the starting and ending zeroes are not of any use
        while(i<n && arr[i]==0) i++; //move i to the first 1
        if(i==n) return 0; // if all the elements are 0

        //sliding window
        j=i;

        while(j<n){
            if(arr[j]==1) j++;
            else{ // arr[j]==0
                if(zeroes==0){
                    j++;
                    zeroes++;
                }
                else{ //zeroes==1
                    int len = j-i-1; //not j-i-1 bcz j is already at second zero and we do not contain the first zero as we delete it
                    maxLen = Math.max(maxLen, len);
                    j++;
                    while(i<n && arr[i]==1) i++; //zero p aa gya
                    i++; //zero se ek aage aa gya
                }
            }
        }
        // to handle cases when there is no zero in array, bcz according to ques in such case you have to remove one ele
        if(zeroes==0){
            return j-i; // 0 1 1 , so I can delete the 0 in beginning and len will be j-i.
        }
        int len = j-i-1;
        maxLen = Math.max(maxLen, len);
        return maxLen;
    }
}
