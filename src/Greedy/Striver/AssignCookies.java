package Greedy.Striver;

import java.util.Arrays;

//leetcode 455
public class AssignCookies {

//    TC=O(nlogn + mlogm)
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;

        int l=0; // on cookies
        int r=0; // on children

        Arrays.sort(g);
        Arrays.sort(s);

        while(l<m && r<n){
            if(g[r] <= s[l]){
                r++;
            }
            l++;
        }

        return r;
    }
}
