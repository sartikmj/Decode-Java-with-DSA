package Array.HomeWorkQuestions;

public class secondLargestElement {
//    Find the second largest element in the given Array in one pass.
    public static void secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>smax){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
    public static void main(String[] ar){
        int[] arr = {0,1,2,3,104,5,99,97,8,89};
        secondLargestElement(arr);
    }
}
