package Array.HomeWorkQuestions;
import java.util.Scanner;
public class smallestMissingElement {
//    WAP to find the smallest missing positive element in the sorted Array. (take the array as input)
    public static int smallestMissingElement(int[] arr) {
        int missing = 1;
        for(int ele : arr){
            if(ele == missing){
                missing++;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //length of array
        System.out.println("Enter the size of the array");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the elements of the sorted array");

        for(int i =0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        int l = smallestMissingElement(arr);
        System.out.println("The smallest missing element is " + l);
    }
}
