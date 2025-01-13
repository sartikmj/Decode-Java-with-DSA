package Array.HomeWorkQuestions;

public class minimumElement {
//    Find the minimum value out of all elements in the array.
    public static void main(String[] a){
        int[] arr = {45,16,89,2,4,29,92};

        int min=Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele<min){
                min=ele;
            }
        }
        System.out.println(min);
    }
}
