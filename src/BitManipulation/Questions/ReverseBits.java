package BitManipulation.Questions;

//leetcode 190
public class ReverseBits {

    //Brute Force
    //TC=O(32) AS=O(32)
//    Convert the num into Binary by dividing it by 2 and saving the remainder in the arraylist
//    You got the reverse bits already.
//    Now convert that binary representation into Decimal Number

//    This method creates a lot of problems with negative numbers

    //Optimal
//    Using Bit Manipulation

//    We will swap the bits for starting and ending, for swapping we will actually toggle the bits if the ith and jth bit are different
//    TC=O(32) AS=O(1)
    public int reverseBits(int n) {
        int i = 0, j = 31;
        while(i<j){
            int iMask = 1<<i; //Mask for flipping i
            int jMask = 1<<j; //Mask for flipping j

            boolean iOn = (iMask & n) != 0;
            boolean jOn = (jMask & n) != 0;

            if(iOn!=jOn){
                //flipping the bits
                n = n ^ iMask; // ith bit is now flipped
                n = n ^ jMask; // jth bit is now flipped
            }

            i++;j--;
        }
        return n;
    }
}
