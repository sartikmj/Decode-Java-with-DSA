package BinarySearch.StriverSheet;

//leetcode 371
public class SumOfTwoInteger {

    public int getSum(int a, int b) {
        // “XOR gives sum without carry, AND gives carry. Repeat until carry is zero.”

        while(b!=0){
            int carry = (a & b) << 1;

            a = a^b;
            b = carry;
        }
        return a; //a becomes the ans
    }
}
