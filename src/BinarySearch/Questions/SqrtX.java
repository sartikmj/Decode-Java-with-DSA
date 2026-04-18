package BinarySearch.Questions;

//Leetcode 69
public class SqrtX {

//    Most simple code by me
    public int mySqrt1(int x) {
        int low = 0;
        int high = x;
        while(low<=high){
            int mid = low + (high-low)/2;
            long square = (long)mid*mid; //to handle Integer Overflow
            if(square==x) return mid;
            else if(square>x) high = mid-1;
            else{ //mid*mid<x
                low=mid+1;
            }
        }
        //if sqrt is in decimal then it will be returned as here as high
        //(low high and mid are at same index)
        //bcz the mid*mid > x, high will shift to mid-1, and loop breaks
        //and for decimal sqrt, we will return high
        return high;
    }

    public static int mySqrt(int x) {
        //fastest way
        // return (int)Math.sqrt(x) //Newton Raphson Method
        long low=0; //typecasting to long to handle large numebrs, that may go out range of int
        long high = (long)x;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid*mid==x) return(int)mid; //returning in int bcz return type is int
                //if sqrt is non-deciml then it will be returned here as mid
            else if(mid*mid>(long)x) high = mid-1;
            else low=mid+1;
        }
        //if sqrt is in decimal then it will be returned as here as high
        return (int)high; //when not finding any element equal to sqrt the loop will end with last element
        //in removed area of binary search , when low=high=mid and then high will move high-1
        //that will be the closest integer to that decimal sqrt
    }

    public static int mySqrt2(int x) {
//        mid*mid=x  => mid = x/mid     -> to avoid using long datatype
        if(x<=1) return x; //to handle case of 0
        int low=0;
        int high = x;
        while(low<=high){
            int mid = (high+low)/2;
            if(mid==x/mid) return mid; // mid*mid=x => mid=x/mid
            else if(mid>x/mid) high = mid-1;
            else low=mid+1;
        }
        return high;
    }
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
}
