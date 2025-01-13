package Array.HomeWorkQuestions;

public class differenceOfEvenOdd {
//    Find the difference between the sum of elements at even indices to the sum of elements at odd indices.

    public static int dif(int[] arr){
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        return even-odd;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(dif(arr));
    }
}
