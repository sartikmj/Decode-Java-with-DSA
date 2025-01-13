package Array.HomeWorkQuestions;

public class palindrome {
//    If an array arr contains n elements, then check if the given array is a palindrome or not .
    public static boolean Palindrome(int[] arr){
        int start=0,end=arr.length-1;
        boolean flag = false;
        while(start<=end){
            if(arr[start] != arr[end]){
                flag = false;
                return flag;
            }
            else{
                start++;
                end--;
            }
        }
        flag = true;
        return flag;
    }

    public static void main(String[] a){
        int[] arr = {1,2,3,3,2,1};

        System.out.println(Palindrome(arr));
    }
}
