package TwoDimensionalArrays.Questions;

public class rotateMatrixBy90Degree {
// Write a program to rotate the matrix by 90 Degree (in same array , not allowed to use different array)

    // First take transpose of the matrix then reverse every row of the matrix.
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length, n = arr[0].length;
        transformIntoTranspose.print(arr);
        //transposing
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                //swap
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        transformIntoTranspose.print(arr);
        //Rotate -> Reverse each row
        for (int i = 0; i < m; i++) { //row
            int start = 0 , end = arr.length - 1; //two pointers for swapping
            //swap arr[i][a] and arr[i][b] , then a++ , b--;
            while(start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        transformIntoTranspose.print(arr);
    }
}
