package Array.HomeWorkQuestions;

public class countStrictlyGreater {
//    Count the number of elements strictly greater than x.
    public static int strict(int[] arr , int x){
        int count=0;
        for(int ele:arr){
            if(ele>x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] a){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(strict(arr,5));
    }
}
