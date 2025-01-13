package BasicSortingAlgorithms;

import java.util.Arrays;

public class builtInSort {
    public static void main(String[] args) {
        int[] arr = {9,5,7,1,9,88,1,66,5,9,123};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
