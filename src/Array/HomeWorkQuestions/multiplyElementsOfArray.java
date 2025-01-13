package Array.HomeWorkQuestions;

public class multiplyElementsOfArray {
//    Calculate the product of all the elements in the given array.
    public static void multiply(int[] arr){
        int product = 1;
        for(int ele : arr){
            product*=ele;
        }
        System.out.println(product);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        multiply(arr);
    }
}
