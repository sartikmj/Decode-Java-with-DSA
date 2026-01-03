package BitManipulation.Questions;

//leetcode 191
public class NumberOf1Bits {

//    Optimal
    //Method 1 -> Continuously removing the right most 1 and counting it, until n becomes 0
    //TCO(count)
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            n = n & (n-1); //removes the right most turn on (1) bit
            count++;
        }
        return count;
    }

//    Brute Force
//    Method 2: We know int has 32 bits so we check for all bits, we make a mask for each bit and does the AND operation
//    and count how many times the operation does not result in 0, hence it is the number of 1 bits.
    public int hammingWeight1(int n) {
        int count = 0;
        int mask = 1;
        for(int i=0;i<32;i++){ //as their are 32 bits in int
            if((n & mask) != 0) count++;
            mask = mask<<1;
        }
        return count;
    }

    //Can also write like this
//    int count = 0;
//    for(int i=0;i<32;i++){
//        int mask = (1<<i);
//        if((n&mask)!=0) count++;
//    }
//    return count;

}
