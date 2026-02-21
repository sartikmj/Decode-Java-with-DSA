package Array.StriverSheet;
import java.util.*;

//Leetcode 349
public class IntersectionOfTwoArrays {

    //Using Two Pointer
    public int[] intersection1(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        List<Integer> list = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) i++;
            else if(b[j]<a[i]) j++;
            else{ //both matched
                if( list.isEmpty() || list.get(list.size() - 1)!=a[i]){
                    list.add(a[i]);
                }
                i++;j++;
            }
        }
        int[] ans = new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k] = list.get(k);
        }
        return ans;
    }

    // Using HashSet -> Simpler and Better
    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer> seta = new HashSet<>();

        for(int i : a) seta.add(i);

        HashSet<Integer> resultSet = new HashSet<>();

        for(int j : b){
            if(seta.contains(j)) resultSet.add(j);
        }

        int[] ans = new int[resultSet.size()];
        int i=0;
        for(int num : resultSet){
            ans[i++] = num;
        }

        return ans;
    }

}
