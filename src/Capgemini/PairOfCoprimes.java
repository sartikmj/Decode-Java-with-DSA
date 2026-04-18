package Capgemini;

import java.util.*;

public class PairOfCoprimes {

    static class Pair{
        int num1;
        int num2;
        public Pair(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
    }

    public static boolean isCoprime(int a, int b){
        int gcd = 1;
        for(int i = 2; i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd==1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,12,8};

        ArrayList<Pair> ans = new ArrayList();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(isCoprime(arr[i],arr[j])) ans.add(new Pair(arr[i],arr[j]));
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i).num1+" "+ans.get(i).num2);
        }
    }

}
