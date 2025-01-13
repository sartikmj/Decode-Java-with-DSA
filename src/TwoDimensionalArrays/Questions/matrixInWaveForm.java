package TwoDimensionalArrays.Questions;

public class matrixInWaveForm {
//     Write a program to Print the matrix in Waveform.
    public static void Waveform(int[][] arr){
        int m = arr.length, n = arr[0].length;
        transformIntoTranspose.print(arr);
        // Wave Print (alternate Row wise printing)
        for(int i = 0 ; i < m ; i++){
            if(i%2 ==0){
                for(int j = 0 ; j < n ; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else{
                for(int j = n-1 ; j>=0 ; j--){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Waveform(arr);
    }
}
