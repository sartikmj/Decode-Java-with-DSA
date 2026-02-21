package BitManipulation.Questions.BitMasking;

public class ClearKthBit {

    static int clearKthBit(int n, int k) {
        // code here
        int m1 = 1<<k;

        int mask = ~ m1; // inverting the mask,

        return n & mask; // only the kth bit will be cleared, if 1 it will become 0, if 0 it will be 0
    }
}
