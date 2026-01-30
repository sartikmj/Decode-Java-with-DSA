package TwoPointers;
import java.util.*;

public class RemoveDuplicates2 {

    //Optimal using Two Pointer
    public int removeDuplicates(int[] nums) {
        //This is a generalised approach of they want 3 ele put i=3, start from j=3, and compare with i-3, jaha jaha 2 hai waha waha 3 krdena hai, same for 1, 4 or any other number.
        if(nums.length<=2) return nums.length;
        int i=2;
        for(int j=2;j<nums.length;j++){ // i=2 bcz prev two we don't care they are already valid
            if(nums[j]!=nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    //Brute Force
    public int bruteForce(int[] nums) {
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i)==1){
                list.add(i);
            }
            else if(map.get(i)>=2){
                list.add(i);
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
