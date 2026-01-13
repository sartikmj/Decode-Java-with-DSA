package SlidingWindow.Questions.Striver;

import java.util.*;

public class FruitIntoBasket {
//    ---> Learn the Better One it is the best actually

//    -> This Question can be reframed as Max Length Subarray with exactly two unique characters

    //TC+O(n2) -> will give TLE error, SC=(3)
    public static int BruteForce(int[] fruits){
        int n = fruits.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            int len = 0;
            for (int j = i; j < n; j++) {
                set.add(fruits[j]);
                if(set.size()<=2){
                    len = j-i+1;
                    maxLen = Math.max(len,maxLen);
                }
                else break;
            }
        }
        return maxLen;
    }

    //Better Approach
    // TC=O(2N), SC=(3)
    public int Better(int[] fruits) {
        int i=0,j=0;
        int n = fruits.length,maxLen=0;
        Map<Integer,Integer> map = new HashMap<>();

        while(j<n){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1); //adding values to map with thier frequency
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[i],map.get(fruits[i])-1);
                    if(map.get(fruits[i])==0){
                        map.remove(fruits[i]);
                    }
                    i++;
                }
            }
            if(map.size()<=2){
                maxLen = Math.max(maxLen,j-i+1);
            }
            j++;
        }
        return maxLen;
    }

    //Best One to learn
    // Another Better Approach
    public int Better2(int[] fruits) {
        int i=0,j=0;
        int n = fruits.length,maxLen=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);
            while(map.size()>2){
                map.put(fruits[i], map.get(fruits[i])-1);
                if(map.get(fruits[i])==0) map.remove(fruits[i]);
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }

    //Optimise
//    TC=O(n), SC=O(1)
    public int totalFruit(int[] fruits) {
        int i=0,j=0,maxLen=0,n=fruits.length;
        Map<Integer,Integer> map = new HashMap<>();

        while(j<n){
            map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);
            if(map.size()>2){
                map.put(fruits[i], map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            if(map.size()<=2){
                maxLen = Math.max(maxLen, j-i+1);
            }
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {

    }
}
