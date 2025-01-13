package BasicSortingAlgorithms;
import java.util.Arrays;
public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {9,5,7,1,9,88,1,66,5,9,123};
        boolean flag = true;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false; //unsorted
                break;
            }
        }
        if(flag) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
