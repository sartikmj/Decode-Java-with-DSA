package DynamicProgramming.Knapsack;

public class KnapsackTabulation {

    //Tabulation
//    Step 1: traverse the array of wt or profit from n-1 to 0 instead 0 to n-1 -> For memo not tabulation
//    Step 2: Jaha function call ho rha hai (profit) waha dp ko access kro -> instead profit(i-1,c) write dp[i-1][c]
//    Step 3: Fill the dp 2D array with the profit values instead of -1
//    Step 4: make the code iterative

    //this has nothing to do with Tabulation it is just to show you can also do Memoization while going from
    // n-1 to 0
    public static int profitMemo(int i, int[] wt, int[] val, int capacity, int[][] dp) { // i is the index
        if (i < 0) return 0;
        if (dp[i][capacity] != -1) return dp[i][capacity];
        int skip = profitMemo(i - 1, wt, val, capacity, dp); // we skip the item
        if (wt[i] > capacity) return dp[i][capacity] = skip; // add in dp here
        int take = val[i] + profitMemo(i - 1, wt, val, capacity - wt[i], dp); // we take the item
        return dp[i][capacity] = Math.max(take, skip); // add in dp here
    }

    public static void main(String[] args) {
        int[] val = {5, 3, 9, 16};
        int[] wt = {1, 2, 8, 10};
        int capacity = 8;
        int n = wt.length;


        //Tabulation -> 0/1 Knapsack

        // i = n-1 to 0 | capacity = capacity to 0
        int[][] dp = new int[n][capacity + 1];
        for (int i = 0; i < n; i++) { // index (i)
            for (int c = 0; c < capacity + 1; c++) { // capacity
                int skip = i>0 ? dp[i - 1][c] : 0; //at i=0, we access dp at index i-1 i.e -1 and if u check the memo code at i<0 we return 0, so here we will store 0 in dp when i=0
                if (wt[i] > c) dp[i][c] = skip; //skip
                else {
                    int pick = val[i];
                    pick += i>0 ? dp[i - 1][c - wt[i]] : 0; // this and above lines combined are just take  = val[i] + dp[i-1][c-wt[i]]
                    // to prevent index out of bound at dp[i-1] we have to use ternary here, at 0 ofc we will return 0 like in skip
                    dp[i][c] = Math.max(pick, skip); //Math.max(skip,take)
                }
            }
        }
        System.out.println(dp[n-1][capacity]); //ans
    }
}
