package Array.basicQuestions;

public class SumOfElements {
    public static void main(String[] a){
        //Find the sum of all the elements of the Array

        int[] arr = {81,1745,36,31,100,60};
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        System.out.print(sum);
    }
}
