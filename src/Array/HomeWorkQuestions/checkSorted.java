package Array.HomeWorkQuestions;
import java.util.Scanner;
public class checkSorted {
//    Check if the given array is sorted or not

    public static boolean checkSorted(int[] arr){
        boolean flag = true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(checkSorted(arr));
    }
}
