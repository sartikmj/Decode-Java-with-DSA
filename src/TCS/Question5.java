package TCS;

import java.util.Scanner;
import java.util.HashMap;

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


    }

    public static void approach1(int[][] matrix, int r, int c){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
        }
        int max = -1;
        int ans=1; //matrix has 1 based indexing
        for(int i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                ans = i;
            }
        }

        System.out.println(ans);
    }

    //Approach 2 Better Simpler

    public static void approach2(int[][] matrix, int r, int c){

        int ans = 0; // 0-based indexing
        int maxcount = 0;

        for(int i=0;i<r;i++){
            int count = 0;
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1) count++;
            }

            if(count>maxcount) ans = i;
        }

        System.out.println(ans + 1); // convert 1-based indexing, bcz ans asks in 1 based indexing
    }
}
