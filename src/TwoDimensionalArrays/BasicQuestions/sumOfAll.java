package TwoDimensionalArrays.Basics.BasicQuestions;

public class sumOfAll {
    //Program to sum all the elements of the 2D array
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,30},{5,10,3}};
        int sum = 0;

        for(int[] ele : arr){
            for(int i : ele){
                sum+=i;
            }
        }

         //or
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                sum+=arr[i][j];
//            }
//        }

        System.out.println(sum);

    }
}
