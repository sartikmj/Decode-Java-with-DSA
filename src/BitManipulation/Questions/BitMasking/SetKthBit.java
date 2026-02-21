package BitManipulation.Questions.BitMasking;

public class SetKthBit {

    //Make a mask, do OR operation bcz if the bit is 0 it will make it 1 or if the bit is 1 it will keep it 1.
    static int setKthBit(int n, int k) {
        // code here
        int mask = 1<<k;

        return n | mask;
    }
}
