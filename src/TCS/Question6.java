package TCS;

import java.util.*;

public class Question6 {

    public static int minOperations(int p, int q, int r){

        int[] arr = {p,q,r};
        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        // if already equal
        if(a == b && b == c) return 0;

        // Parity Check
//        If two numbers differ by an odd amount,
//        you can NEVER make them equal using operations that change difference by 2.
//        Because:
//        Even difference → can become 0
//        Odd difference → will always stay odd
        if((c-a)%2 != 0 || (c-b)%2 != 0){
            return -1;
        }

        //Steps Calculation
        int steps = ( (c-a)/2 ) + ( (c-b)/2 );

        return steps;
    }

    public static void main(String[] args) {

        // we will go with greedy approach, add +1 to the two smaller numbers and subtract -1 from the largest number

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();

            int ans = minOperations(p,q,r);
            System.out.println(ans+ " ");
        }
        sc.close();
    }
}
