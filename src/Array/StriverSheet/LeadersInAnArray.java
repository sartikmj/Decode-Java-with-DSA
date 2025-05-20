package Array.StriverSheet;
import java.util.ArrayList;
import java.util.Collections;
public class LeadersInAnArray {

    //Better Approach TC=O(N2)
    public static ArrayList<Integer> leaders1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            boolean leader = true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader == true) list.add(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }

    //Optimal Approach TC=O(N)
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }

}
