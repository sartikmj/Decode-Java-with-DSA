package Array.HomeWorkQuestions;
import java.util.Arrays;
public class tripletsSum {
//    Count the number of triplets whose sum is equal to the given value x.

    public static int tripletsSum(int[] arr, int x) {
        int count=0;
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){

        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(tripletsSum(arr,3));
    }
}
