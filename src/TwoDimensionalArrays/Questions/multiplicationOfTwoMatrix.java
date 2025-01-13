package TwoDimensionalArrays.Questions;

public class multiplicationOfTwoMatrix {
    public static void main(String[] args) {
        int[][] a = {{}};
        int[][] b = {{}};

        if(a.length != b[0].length){
            System.out.println("Multiplication is not possible");
        }
        else{
            int[][] c = new int[a.length][b[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    for(int k=0;k<b.length;k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
    }
}
