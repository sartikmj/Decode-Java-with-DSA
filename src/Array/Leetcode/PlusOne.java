package Array.Leetcode;
//leetcode 66
public class PlusOne {

    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0; //if digit is 9 set that as 0 , the loop will increament the next digit further
        }
        //special case when there is only one digit 9 or all the characters are equal to 9

        int[] newNumber = new int[n+1];
        newNumber[0] = 1; //all other indexes will be 0 by default

        return newNumber;
    }

    public static void main(String[] args) {

    }
}
