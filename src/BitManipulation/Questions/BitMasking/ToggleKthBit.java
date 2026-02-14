package BitManipulation.Questions.BitMasking;

public class ToggleKthBit {

    static int toggleKthBit(int n, int k){

        int mask = 1<<k;

        return n ^ mask;
    }
}
