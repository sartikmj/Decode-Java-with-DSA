package Array.Questions;

public class PrintAllSubarrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;

        //Brute Force
        //-> using three for loop
        for (int i = 0; i < n; i++) {
            for (int j = i ; j < n; j++) {
                for (int k = i ;k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

}
