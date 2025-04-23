package Array.StriverSheet;

public class RearrangeArrayElementsBySign {
    //leetcode 2149

    public int[] rearrangeArray(int[] arr) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){

            if(arr[i]<0){
                ans[neg] = arr[i];
                neg+=2;
            }
            else{
                ans[pos] = arr[i];
                pos+=2;
            }
        }
        return ans;
    }
}
