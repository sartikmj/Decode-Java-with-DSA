package SlidingWindow.GFG;

import java.util.ArrayList;

public class MaximumSubArray {

    public ArrayList<Integer> findSubarray(int[] arr) {
        // code here
        int n = arr.length;
        int i=0,j=0;
        int s=0,e=0;
        int len = 0, maxLen = 0;
        int sum=0,maxSum=0;
        boolean found = false;
        while(j<n){
            if(arr[j]>=0){
                found = true;
                sum+=arr[j];
                len = j-i+1;
                j++;

                if(sum > maxSum){
                    s=i;
                    e=j-1;
                    maxSum = sum;
                    maxLen = j-i;
                }
                else if(sum==maxSum && len > maxLen){
                    s=i;
                    e=j-1;
                    maxLen = len;
                }
            }

            else if(arr[j]<0){
                sum=0;
                while(j<n && arr[j]<0){
                    j++;
                }
                i=j;
            }

        }

        if(found==false){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int x=s;x<=e;x++){
            ans.add(arr[x]);
        }

        return ans;
    }
}
