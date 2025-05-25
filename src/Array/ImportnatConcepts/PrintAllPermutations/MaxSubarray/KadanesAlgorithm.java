package Array.ImportnatConcepts.PrintAllPermutations.MaxSubarray;

public class KadanesAlgorithm {

//    TC=O(n) SC=O(1)
    public static void maxSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum=0;
        int start=0; //whenever sum=0, start will point there
        int ansStart=-1; //to store the starting index of max Subarray, when sum>max it will point there
        int ansEnd=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];

            if(sum>max){
                ansStart = start;
                ansEnd = i;
                max = sum;
            }


            if(sum<0){
                sum=0;
            }
        }

        System.out.print( "max subarray is : ");
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        maxSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
