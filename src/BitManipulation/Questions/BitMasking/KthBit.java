package BitManipulation.Questions.BitMasking;

public class KthBit {

    static boolean checkKthBit(int n, int k) {
        // code here
        int mask = 1<<k; //making a mask

        if( (n & mask) == 0) return false;

        else return true;

        //OR

//        return (n & (1<<k)) != 0;

    }

    // You can take the bit at the right most place by right shift
    // then check if the final number is even or odd, if odd means its set if even means its not set
    //REMEMBER -> for Odd number last bit is 1 and for Even number last bit is 0

    static boolean checkKthBit1(int n, int k) {
        // code here
        return ((n>>k)%2==1);
    }

    public static void main(String[] args) {
        //Masking
        //Making a mask is means just left shift number 1 with the mask you need
    }
}
