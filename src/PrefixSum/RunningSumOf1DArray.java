package PrefixSum;

//leetcode 1480
public class RunningSumOf1DArray {

    //TC=O(n) SC=O(n)
    public int[] runningSum1(int[] arr) {
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = arr[i] + pre[i-1];
        }
        return pre;
    }

    //Instead of using new array we can make changes in our own array.
    //TC=O(n) SC=O(1)
    public int[] runningSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
