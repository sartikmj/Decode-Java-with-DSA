package BitManipulation.Questions;

//leetcode 342
public class PowerOf4 {

    //Bit Manipulation
    //Concept: If a number is a power of 2 also it is a perfect square then surely it is a power of 4
    public boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public boolean isPowerOfFour(int n) {
        //in power of 2
        if (n <= 0) return false;
        return ((n & (n - 1)) == 0) && isPerfectSquare(n);
    }


    //Recursion
    public boolean isPowerOfFour1(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 4 != 0) return false;

        return isPowerOfFour1(n / 4);
    }

}
