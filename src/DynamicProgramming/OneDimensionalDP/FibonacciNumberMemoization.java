package DynamicProgramming.OneDimensionalDP;

public class FibonacciNumberMemoization {

    //DP Recursion + Memoization, Top Down DP, Recursive DP

    //You can either pass the lookup array as global or pass it in method

    // TC=O(N), SC=O(N)

    public int fibo(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!=0) return dp[n]; // new, getting from lookup array

        int ans = fibo(n-1, dp) + fibo(n-2, dp);

        dp[n] = ans; // new, putting inyo lookup array

        return ans;

    } // writing like this one is better

    // OR in short you can write like this
        public static int fiboo(int n, int[] dp){
            if(n<=1) return n;
            if(dp[n]!=0) return dp[n];

            return dp[n] = fiboo(n-1, dp) + fiboo(n-2, dp);
        }

    public static int fib(int n) {
        int[] dp = new int[n+1]; //index from 0 to n
        return fiboo(n,dp);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

}
