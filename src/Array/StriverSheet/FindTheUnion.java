package Array.StriverSheet;
import java.util.*;
public class FindTheUnion {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> union = new ArrayList<>();

        int n=a.length;
        int m=b.length;

        int i=0;
        int j=0;

        //instead of using union.get(union.size()-1) u can use union.getLast()

        while(i<n && j<m){
            if(a[i]<b[j]){
                if(union.size()==0 || a[i]!=union.get(union.size()-1)){
                    union.add(a[i]);
                    i++;
                }
                else i++;
            }
            else if(b[j]<=a[i]){
                if(union.size()==0 || b[j]!=union.get(union.size()-1)){
                    union.add(b[j]);
                    j++;
                }
                else j++;
            }
        }

        while(i<n){
            if(a[i]!=union.get(union.size()-1)){
                union.add(a[i]);
                i++;
            }
            else i++;
        }

        while(j<m){
            if(b[j]!=union.get(union.size()-1)){
                union.add(b[j]);
                j++;
            }
            else j++;
        }

        return union;
    }
}
