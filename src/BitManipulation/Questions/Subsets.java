package BitManipulation.Questions;

import java.util.ArrayList;
import java.util.List;

//leetcdoe 78
public class Subsets {

//    DIDN'T UNDERSTAND IT WATCH AGAIN

    //TC=O(N*2^n) SC=O(n*2^n)
    public List<List<Integer>> subsets(int[] nums) {
        //Bit Manipulation
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int total = 1<<n; //total number of subsets 2^n

        for(int num=0;num<total;num++){
            List<Integer> list = new ArrayList<>();
            for(int bitidx=0; bitidx<n;bitidx++){ //checking all the bits int the number
                int mask = (1<<bitidx);//to find the bit which is 1
                if((num & mask) !=0) list.add(nums[bitidx]);
            }
            ans.add(list);
        }
        return ans;
    }

}
