package BasicSortingAlgorithms.Questions;

import BasicSortingAlgorithms.BubbleSort.BubbleSort;

public class MoveZeroesToEnd {
//    Leetcode 283
//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//     Note that you must do this in-place without making a copy of the array.

    //Approach 1 : use new array then count the number of zeroes then insert the non zero elements of array in the new array
    //in same order then insert the 0s at the end we counted how many zeroes are there insert them at the end of new array

    //Approach : Without Using new space
    //kind of bubble sort swap elements till end until all zeroes are at the end

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;
        for(int x=0;x<n-1;x++){
            for(int i=0;i<n-1;i++){
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        BubbleSort.print(arr);
    }
}
