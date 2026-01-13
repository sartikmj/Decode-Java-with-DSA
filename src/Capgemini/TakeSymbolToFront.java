package Capgemini;

import java.util.Arrays;

public class TakeSymbolToFront {

    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";

        char[] arr = s.toCharArray();
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]=='#'){
//                int j=i;
//                while(j!=0){
//                    char temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    j--;
//                }
//            }
//        }

//        System.out.println(new String(arr));

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='#'){
                count++;
            }
        }
        String ans = "";
        for(int i=0;i<count;i++){
            ans+='#';
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!='#') ans+=arr[i];
        }

        System.out.println(ans);
    }

}
