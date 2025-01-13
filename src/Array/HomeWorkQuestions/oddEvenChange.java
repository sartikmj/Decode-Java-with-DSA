package Array.HomeWorkQuestions;

public class oddEvenChange {
//    Given an array of integers, change the value of all odd indexed elements to its second multiple and
//increment all even indexed values by 10.

    public static int[] change(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i] = arr[i] + 10;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    public static void main(String[] a){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        change(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
