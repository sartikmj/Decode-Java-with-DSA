package Capgemini;

import java.util.Map;
import java.util.LinkedHashMap;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aabbbbddeeeeffggg";

        char[] arr = s.toCharArray();
        String ans = "";
//        int i=0,j=0;
//
//        while(j<arr.length){
//
//            if(arr[i]==arr[j]) j++;
//            else{
//                ans+=arr[i];
//                int len = j-i;
//                if(len>1) ans+=len;
//                i=j;
//            }
//        }
//        ans+=arr[i];
//        int len = j-i;
//        if(len>1) ans+=len;

//        int count = 1;
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] == arr[i-1]) count++;
//            else{
//                ans += arr[i-1];
//                ans+= count+"";
//                count=1;
//            }
//        }
//        ans = ans + arr[arr.length-1] + count+"";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : arr){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char key : map.keySet()){
            ans+=key;
            int count = map.get(key);
            if(count>1) ans+=count;
        }

        System.out.println(ans);
    }
}
