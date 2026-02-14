package BitManipulation.Questions;

public class TurnOffTheRightMostSetBit {

    //Very Important Concept Method
    //For a N if you want N-1 in binary just take the binary of N make its right most set bit 0

//    -------------IMPORTANT------------------
//    If you AND (&) N and N-1 the right most set bit of N will get off.

    static int turnOffTheRightMostSetBit(int n){
        return n & (n-1);
    }


    // Basic Method
    //TC=O(logN)
    static int turnOffTheRightMostSetBit1(int n) {
        // code here
        //find k
        //turn it off using mask

        int a = n;
        int k = 0;
        while(a%2==0){
            a = a>>1;
            k++;
        }

        int mask = ~(1<<k);

        return n & mask;
    }
}
