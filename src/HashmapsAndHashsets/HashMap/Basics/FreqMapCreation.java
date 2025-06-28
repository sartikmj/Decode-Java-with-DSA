package HashmapsAndHashsets.HashMap.Basics;

import java.util.HashMap;

public class FreqMapCreation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,1,4,3,3,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        // Freq map. Easier version
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1); // 🔥 FIX: Simplified frequency update
        }
    }
}
