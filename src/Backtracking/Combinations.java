package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public void backtrack(List<List<Integer>> result, List<Integer> comb, int start, int n, int k){
        if(comb.size()==k){
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int i=start;i<=n;i++){ //range is from 1 to n both inclusive
            comb.add(i);
            backtrack(result,comb,i+1,n,k);
            comb.remove(comb.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        //                                  start,end
        return result;
    }
}
