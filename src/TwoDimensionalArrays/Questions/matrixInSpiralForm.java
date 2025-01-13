package TwoDimensionalArrays.Questions;

public class matrixInSpiralForm {
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
    // Write a program to print the matrix in Spiral form.
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        print(arr);
        System.out.println();
        int m = arr.length;
        int n = arr[0].length;
        //spiral form
        int minr = 0 , maxr = m-1 , minc = 0 , maxc = n-1;

        while(minr<=maxr && minc<=maxc){

            //left to right
            for(int j = minc ; j<=maxc ; j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;

            if(minr>maxr || minc>maxc)break; //agar beech wale loop tk hi sab print ho gaya fir wahi break ho jayega , extra kuch loop nahi chalega.
            //top to bottom
            for(int i = minr ; i<=maxr ; i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;

            if(minr>maxr || minc>maxc)break; //instead of this condition we can also use a count variable which we will ++ everytime and also check it every time and when the count > m+n , we will break the loop.
            //right to left
            for(int j=maxc ; j>=minc ; j--){
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;

            if(minr>maxr || minc>maxc)break;
            //bottom to top
            for(int i = maxr ; i>=minr ; i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }
    }
}
