package Array.Leetcode;

public class MajorityElement {

//    Moore's Voting Algorithm

//    Approach:
//    Initialize 2 variables:
//    Count –  for tracking the count of element
//    Element – for which element we are counting
//    Traverse through the given array.
//    If Count is 0 then store the current element of the array as Element.
//    If the current element and Element are the same increase the Count by 1.
//    If they are different decrease the Count by 1.
//    The integer present in Element should be the result we are expecting, if there exists one
    public static int majorityElement(int[] nums){
        int n = nums.length;
        int count = 0; //count
        int element = 0; //element

        //Applying Algorithm
        for(int i=0;i<n;i++){
            if(count == 0){
                count=1;
                element = nums[i];
            }
            else if(element == nums[i]) count++;
            else{ //element!=nums[i]
                count--;
            }
        }

//        You may first check before returning that the element occurs >n/2 times in the array

        return element;
    }
}
