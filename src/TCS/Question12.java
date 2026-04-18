package TCS;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for(int i=0;i<n;i++){
                String word = "";
                for(int j=0;j<n;j++){
                    word = ""+arr[i] + arr[j];

                    int w = Integer.parseInt(word);

                    if(w>=x && w<=y) count++;
                }
            }
            System.out.println(count);
        }
    }
}
