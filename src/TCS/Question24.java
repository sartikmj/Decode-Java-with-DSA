package TCS;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Question24 {

    public static boolean divSeven(int a){
        return a%7==0;
    }

    public static boolean notDivFive(int a){
        return a%5!=0;
    }

    public static boolean notPalindrome(int a){
        int temp = a;
        int rev=0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp/=10;
        }

        return rev!=a;
    }

    public static boolean notRepeat(int a){

        String sa = ""+a;
        char[] arr = sa.toCharArray();

        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        //divisibility by 7
        //not divisible by 5
        //not a palindrome
        //does not contain any repetitive digits

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=l;i<=r;i++){

            if(divSeven(i) && notDivFive(i) && notPalindrome(i) && notRepeat(i)){
                ans.add(i);
            }
        }

        if(ans.isEmpty()){
            System.out.print(-1);
            return;
        }

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i));

            //to avoid trailing space
            if(i!=ans.size()-1) System.out.print(" ");
        }
    }
}
