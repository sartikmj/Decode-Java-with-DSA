package Strings.Questions;

public class stringWithMaxIntValue {
    //Given n string consisting of digits from 0 to 9. Return the string which has , maximum value

//  The below to methods are not answers just for understanding the solution in below main function.

    public static void myMethod(String[] srr){
        int[] arr = new int[srr.length];
        for (int i = 0; i < srr.length; i++) {
            arr[i] = Integer.parseInt(srr[i]);
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
    public static void sirMethod(String[] arr){
        int max = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            max = Math.max(max,n);
        }
        System.out.println(max);
    }

    // These above methods have a problem that they can not handle the value which is too large to be stored inside any numeric datatype

    // so now we will not convert string into int to compare them we will directly compare the strings
//    first we will check the length the string with greater length have a bigger number but,
//    before coming on that we have to remove leading zeroes from all the strings , that can make the logic of bigger length bigger number fail
//    Keep in mind you have to return the real string not the one after removing leading zeroes




    public static void main(String[] args) {
        String[] srr = {"4564896549856594865","000000000000000000000000000000000000000000546" , "4249812848569465" , "-852" , "35715965159562"};
//        myMethod(srr);
//        sirMethod(srr);
        solution(srr);

    }

    public static void solution(String[] arr){
        String maxS = arr[0];
        for(int i=1;i<arr.length;i++){
            maxS = max(maxS,arr[i]); //user defines method max which will return the greater string.
        }
        System.out.println(maxS);
    }


    public static String max(String a, String b){
        String s = purify(a);
        String t =purify(b); //removes leading 0s
        if(s.length() > t.length()) return a;
        if(s.length() < t.length()) return b;

        //if both have same length we will check further
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t.charAt(i)){ //if the digit is not same , NOTE:- ASCII values are being compared
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
//        if after purifying are the same number , then return which has greater length before purifying
        if(a.length() > b.length()) return a;
        else return b;
    }

    //another method purify to remove the leading zeroes

    public static String purify(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '0') return s.substring(i); // jaha se string me 0(character) nahi waha se lekr end tk hi string return krdo.
        }
        return s;
    }
}
