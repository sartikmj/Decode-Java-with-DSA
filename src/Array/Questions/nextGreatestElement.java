package Array.Questions;

public class nextGreatestElement {
    //the greatest element next to the current element

    //Method 1 : Brute Force
    // high time complexity , not a good method
    public static void Method1(int[] arr , int[] ans){
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max = arr[j];
                    // arr[i] = arr[j]; Directly updating the arr in the loop will corrupt the array ,
                }
            }
            ans[i] = max;
        }
    }

    //Method 2: Optimised ,  in One Pass
    public static void Method2(int[] arr , int[] ans){
        int nge = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            ans[i] = nge;
            if(arr[i]>nge){
                nge = arr[i]; // or Math.max(nge,arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        //NOTE: The last element will not have any greatest element so we will store -1 for it.
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int[] ans = new int[arr.length];
        ans[arr.length-1] = -1;

//        Method1(arr,ans);
        Method2(arr,ans);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
