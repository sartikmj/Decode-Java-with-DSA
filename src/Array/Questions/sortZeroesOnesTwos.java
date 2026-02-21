package Array.Questions;

public class sortZeroesOnesTwos {
    // This questions also known as Sort Colors and Dutch Flag Algorithm

    //Method 1: Two Pass
    //1. Count the number of 0s, 1s and 2s
    //2. Update the array first indexes with 0s, 1s and then 2s
    //3. make sure the if conditions in the 2nd loop are correct from

    public static void Method1(int[] arr){
        int noOfZeroes = 0, noOfOnes = 0, noOfTwos = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0) noOfZeroes++;
            else if(arr[i] == 1) noOfOnes++;
            else if(arr[i] == 2) noOfTwos++;
        }
        for(int i =0 ; i<arr.length;i++){
            if(i<noOfZeroes) arr[i] = 0;
            else if(i<noOfOnes + noOfZeroes) arr[i] = 1;
            else if(i<noOfTwos + noOfOnes + noOfZeroes) arr[i] = 2; // u can use else , i used the complete condition to show the logic.
        }
    }

    //Method 2: Dutch Flag Algorithm , Three Pointer Approach , One Pass
    //1. take 3 variables low ,mid and high
    //2. Break Array in 4 parts
        // 1st-> 0 to low-1 => contains zeroes
        //2nd-> low to mid-1 => contains ones
        //3rd-> mid to high => can contain anything [Unsorted Part]
        //4th-> high+1 to len-1 =< contains twos
    //3. if mid = 0, Compare the index mid element with index low, swap it with low as low contains 1,
        //->increase low by one index bcz all Zeroes are before low , increase mid by one index as all Ones are before mid.
    //5. if mid=1 , just mid++
    //6. if mid=2 , swap it with high bcz all the two comes after high ,
        //-> high--
    //7. loop will run mid<=high
    //8. at the question on unsorted array , mid and low are put on 0th index and high is put on last element.

    public static void Method2(int[] arr){
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) { // loop until mid crosses high
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid] and move both low and mid pointers forward
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                // If arr[mid] is 1, just move mid forward
                mid++;
            }
            else { // arr[mid] == 2
                // Swap arr[mid] and arr[high] and move high pointer backward
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                // Do not increment mid here, as the swapped element at mid needs to be processed
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,2,2,0,1,1,0};
//        Method1(arr);
        Method2(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
