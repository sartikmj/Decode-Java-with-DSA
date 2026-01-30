package BitManipulation.Questions;

//leetcdoe 2220
public class MinimumBitsFlipsToConvertNumber {

    //Intuition: We need to make start to goal so we need to flip the bits in start that differ from goal, hence the bits we need to change
    // So to get the bits that we need to change we will use the XOR operator, so where ever we need to flip the bits we will get 1 there
    // Now count the number of turn on bits , and that the number of bits need to be flipped.
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal;
        int count = 0;
        while(n>0){
            n = n & n-1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
