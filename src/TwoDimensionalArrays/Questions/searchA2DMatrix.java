package TwoDimensionalArrays.Questions;

public class searchA2DMatrix {
    //Leetcode 240
    //Write an efficient algorithm that searches for a value target in an mxn integer matrix which has the following properties:
    //->Integers in each row are sorted in ascending from left to right .
    //->Integers in each column are sorted in ascending from top to bottom .

    public static boolean searchTarget(int[][] matrix,int target){
        int i = 0;//for rows
        int j= matrix[0].length-1;//for cols

        while(i<matrix.length && j>=0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(target > matrix[i][j]){ //go down
                i++;
            }
            else if(target < matrix[i][j]){ //go left
                j--;
            }
        }
        return false;
        //you can also do it from the other side of the diagonal.
    }

    //This is not an Efficient Solution
    //TIme Limit Exceeded error
    //no of iterations = m*n
    public static boolean searchTarget2(int[][] matrix,int target){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag = false;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == target){
                    flag = true;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        System.out.println(searchTarget(matrix,1));
    }
}
