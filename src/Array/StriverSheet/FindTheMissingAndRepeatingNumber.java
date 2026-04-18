package Array.StriverSheet;

import java.util.ArrayList;

public class FindTheMissingAndRepeatingNumber {

    //Brute Force TC=O(n^2) SC=O(1)
    //we know there are n numbers hence 1 to n
    public int[] Brute(int[] arr){
        int n = arr.length;
        int[] ans = new int[2];
        int repeating=-1, missing=-1;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==i) count++;
            }
            if(count==2) repeating=i; //Repeating Number
            else if(count==0) missing=i; //Missing Number
            if(repeating!=-1 && missing!=-1){
                break;
            }
        }
        ans[0]=repeating;
        ans[1]=missing;

        return ans;
    }

    //Better TC=O(N) SC=O(N)
    //Use Hashing, Hash Array
    public int[] better(int[] arr){
        int n = arr.length;
        int[] hash = new int[n+1]; //to store the freq of n numbers size should be n+1, bcz it starts from index 0
        int repeating=-1, missing=-1;
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        for(int i=1;i<n;i++){
            if(hash[i]==2) repeating=i;
            else if(hash[i]==0) missing=i;
        }
        int[] ans = new int[2];
        ans[0]=repeating;
        ans[1]=missing;

        return ans;
    }

    //Optimal 1 TC=O(1) SC=O(1)
    //Mathematical Solution -> Using natural number sum and then solving two linear equations
    public int[] optimal(int[] arr){
        long n = arr.length;

        // S - Sn
        // S2 - S2N

        long Sn= n*(n+1)/2;
        long S2n = n*(n+1)*(2*n+1)/6;

        long S=0,S2=0;
        for(int i=0;i<n;i++){
            S+=arr[i];
            S2+=(long)arr[i]*(long)arr[i];
        }

        //Eq 1
        long val1 = S - Sn; // x - y
        //Eq2
        long val2 = S2 - S2n;

        val2 = val2/val1; // x - y

        long x = (val1 + val2)/2;

        long y = x - val1;

        return new int[]{(int)x,(int)y};

    }

    public static void main(String[] args) {

    }

}
