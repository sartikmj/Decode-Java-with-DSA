package BasicSortingAlgorithms.Questions;

import java.util.Arrays;

public class MajorityElement {
    //Leetcode 169
    //Majority element is an element that appears more than n/2 times

    //Approach : step1: sort the array
    //step 2: in the sorted array the n/2 th ele,ent will be the Majority Element

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2};
        int n = arr.length;
        //Sorting the array
        Arrays.sort(arr);

//        //sorting the array
//        int n = arr.length;
//        for(int i=1;i<n;i++){
//            int j=i;
//            while(j>=1 && arr[j]<arr[j-1]){
//                //swap
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
//                j--;
//            }
//        }

        //The majority element
        int maj = arr[n/2];
        System.out.println(maj);
    }
}
