package HashmapsAndHashsets.HashMap.Questions;

import java.util.*;

//leetcode 2094
public class Finding3DigitEvenNumbers {
    // we will traverse the array and store its values with their freq in HashMap
    //we will loop to get all the possible 3 digit even numbers, now for every 3 digit even number we will get every digit of it.
    //Now check does those 3 digits exists in HashMap with at least 1 freq, if not move forward.

    //TC=O(n+500) as n=300 so TC=O(500)
    public int[] findEvenNumbers(int[] arr) {
        //freq map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else
                map.put(ele, 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 100; i <= 999; i+=2) { //getting all 3 digit even numbers
            int x = i;
            //getting all the individual digits of the number
            int c = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int a = x;

            //Main Code
            //checking if the these digits exists in Map
            if (map.containsKey(a)) {
                //dec the freq so that one element does not come more than its freq
                int aFreq = map.get(a);
                map.put(a, aFreq - 1);
                if (aFreq == 1)
                    map.remove(a); //imp in java to remove freq 0 key from map
                if (map.containsKey(b)) {
                    int bFreq = map.get(b);
                    map.put(b, bFreq - 1);
                    if (bFreq == 1)
                        map.remove(b);
                    if (map.containsKey(c)) {
                        ans.add(i);
                    }
                    map.put(b,bFreq);
                }
                //getting the original freq back
                map.put(a, aFreq);
            }
        }
        //to return in integer array
        int[] ans2 = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans2[i] = ans.get(i);
        }

        return ans2;
    }
}
