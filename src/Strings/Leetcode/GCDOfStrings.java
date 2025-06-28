package Strings.Leetcode;

public class GCDOfStrings {
    //Leetcode 1071
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int s1 = str1.length();
        int s2 = str2.length();
        String s = "";

        int lenGCD = gcd(s1,s2);

        return str1.substring(0,lenGCD);

    }
    public int gcd(int s1, int s2){
        for(int i = Math.min(s1,s2);i>0;i--){
            if(s1%i==0&&s2%i==0){
                return i;
            }
        }
        return 1;
    }
}
