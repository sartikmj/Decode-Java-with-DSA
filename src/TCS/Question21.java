package TCS;

import java.util.Scanner;

public class Question21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr =  s.toCharArray();

        for(int i=0;i<=arr.length-3;i++){
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2]){
                System.out.print("Spam");
                return;
            }
        }
        System.out.print("Safe");
    }
}
