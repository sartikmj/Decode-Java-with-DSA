package Array.StriverSheet;

public class CountInversions {

    // Brute Force TC=O(N^2) SC=O(1)
    static int inversionCount(int arr[]) {
        // Code Here
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]) count++;
            }
        }
        return count;
    }

    //Optimal -> Using Divide and Conquer
}
