package TwoDimensionalArrays.Basics;

public class declaration {
    public static void main(String[] a){
        int[][] arr = new int[3][3];
        //10 20 30
        //40 50 60
        //70 80 90
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;
        //default value inside Two Dimensional Array is 0
        System.out.println(arr[1][2]);

    }
}
