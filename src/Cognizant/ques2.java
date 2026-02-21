package Cognizant;

import java.util.Arrays;

public class ques2 {

    public static int operations(int[] arr){
        int targetSum = (arr.length * arr.length - 1)/2;
        int realSum = 0;
        for(int ele : arr){
            realSum += ele;
        }
        return targetSum - realSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,4};

        System.out.println(operations(arr));
    }
}
