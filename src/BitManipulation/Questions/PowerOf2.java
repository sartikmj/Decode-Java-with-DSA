package BitManipulation.Questions;

//Leetcode 231
public class PowerOf2 {

    //Bit Manipulation Method
    //TC=O(1)
    //Using AND Operator

//    ----------IMPORTAANT--------------
    //if n is power of two then its n & (n-1) will always be zero,
    //eg: 8 = 1000 , 7 = 0111 , their AND will be 0

    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false; // 0 and -ve numbers are not powers of 2
        return ((n & (n-1))==0);
    }

    //Recursive Method
    //TC=O(logN)
    public boolean isPowerOfTwo1(int n) {
        if(n==1) return true;
        if(n<=0 || n%2!=0) return false;
        return isPowerOfTwo1(n/2);
    }
}
