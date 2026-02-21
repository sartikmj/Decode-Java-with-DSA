package DynamicProgramming.TwoDimensionalDP;

public class CountSquareSubmatricesWithAllOnes {

    //first we will check if for a one all other blocks of a square are also one then make it a 2, then if there is
    // one around which all other 3 blocks are 2 then put that block with value 3
    // after all this, traverse the matrix and add all the numbers and you will get the total number of
    // Submatrices with all ones

    // -> 1 means it denotes 1 square of 1x1, 2 denotes 2 squares 1x1 & 2x2 and 3 denotes 3 squares 1x1 2x2 3x3

    //arr[i][j] = the side of square whose bottom right corner is i,j

    //Tabulation
    //TC=O(n) SC=O(n)
    public int countSquares(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0) continue; //kuch krna hi nahi hai
                if(i!=0 && j!=0){ //means not 1st row or 1st col, or we can say if(i>0 && j>0)
                    arr[i][j] = Math.min(arr[i-1][j], Math.min(arr[i][j-1], arr[i-1][j-1]));
                }
                count+= arr[i][j];
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
