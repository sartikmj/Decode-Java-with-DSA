package Array.HomeWorkQuestions;

public class largestThreeElements {
//WAP to find the largest three elements in the array.

    public static void LargestThree(int[] arr){
        int one = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>one){
                third = second;
                second = one;
                one = arr[i];
            }
            else if(arr[i]>second){
                third = second;
                second = arr[i];
            }
            else{
                third = arr[i];
            }
        }
        System.out.println("The three largest elements are "+one+" "+second+" "+third);
    }

    public static void main(String[] a){
        int[] arr = {1,2,3,89,45,16,79,26,18,49};

        LargestThree(arr);
    }
}
