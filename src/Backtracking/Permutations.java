package Backtracking;

import java.util.ArrayList;
import java.util.List;

//leetcode 46
public class Permutations {

    // Method 1
    //TC=O(n!)
    public void helper(int[] arr, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans){
        if(ds.size() == arr.length){ //when size of ds is same as array
            List<Integer> list = new ArrayList<>();
            //we need to do this bcz ds is pass by reference.
            for(int i : ds){
                list.add(i);
            }
            ans.add(list);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(isValid[i]==false){ //call lagega, to check if the number is not already in the perm
                ds.add(arr[i]);
                isValid[i] = true;

                //recursion
                helper(arr,ds,isValid,ans);

                //backtracking
                isValid[i] = false;
                ds.remove(ds.size() - 1);

            }
        }
    }

    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>(); //in which we will makee permutation
        boolean[] isValid = new boolean[arr.length]; //by default are false

        helper(arr,ds,isValid,ans);

        return ans;
    }


    //Method 2

    //TC=O(N!) SC=O(1)

//    We will have an idx initialised as 0 now from idx to end of the arr, we will swap each index with our idx and after swapping
//    inc it, we will keep doing it until idx == arr.length-1 i.e. the last index, and we will get our permutations

    public void helper(int[] arr, int idx, List<List<Integer>> ans){
        if(idx == arr.length-1){
            List<Integer> list = new ArrayList<>();
            for(int i : arr){
                list.add(i);
            }
            ans.add(list);
            return;
        }
        for(int i=idx;i<arr.length;i++){

            swap(i,idx,arr); //swapping idx and i th ele

            //Recursion
            helper(arr,idx+1,ans);

            //Backtracking
            swap(i,idx,arr);
        }
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    public List<List<Integer>> permute1(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(arr,0,ans);

        return ans;
    }


}
