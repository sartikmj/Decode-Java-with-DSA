package HashmapsAndHashsets.HashMap.Questions;

import java.util.HashMap;

//Leetcode 1497
public class CheckIfArrayPairsAreDivisibleByK {

    //in map we will insert the value of arr[i]%k==0
    //then inside map traverse and check if K-ele does exist in the map, after finding it
    //compare their frequencies if there freq are not equal means they can not be paired return false.

    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ele = arr[i]%k;
            //IMP -> to handle negative numbers.
            if(ele<0) ele+=k;
            //instead of above two lines we can write, int ele = ((arr[i]%k)+k)%k;
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele,1);
        }
        //to handle numberes which are individually divisible by k.
        if(map.containsKey(0)){
            if(map.get(0)%2!=0){ //if the freq of 0 is odd mean those numbers can not be paired
                return false;
            }
            map.remove(0); //after checking it remove 0
        }

        if(k%2==0 && map.containsKey(k/2)){
            if(map.get(k/2)%2!=0) return false;
            map.remove(k/2);
        }

        for(int key : map.keySet()){
            int rem = k - key; //remaining value
            if(map.containsKey(rem)==false) return false;
            int keyFreq = map.get(key);
            int remFreq = map.get(rem);
            if(keyFreq!=remFreq) return false;
        }
        return true;
    }
}
