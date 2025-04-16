package TwoDimensionalArrays.Questions;

public class multiplicationOfTwoMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] c = new int[a.length][b[0].length];
        if(a[0].length != b.length){
            System.out.println("Multiplication is not possible");
            return;
        }
        else{
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    for(int k=0;k<b.length;k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }

        for(int[] e : c){
            for(int x : e){
                System.out.print(x + " ");
            }
        }
    }
}
