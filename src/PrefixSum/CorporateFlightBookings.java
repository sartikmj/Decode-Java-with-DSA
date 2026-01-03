package PrefixSum;

//Leetcode 1109
public class CorporateFlightBookings {

//    Optimal 3 ms
//    for every array add the seats to the first position and put minus the number of seats at last + 1 position
//    Do it for all
//    now do the prefix sum in that array, you will get your ans
//    why we did minus seats in last + 1, so while calculating prefix sum the number of seats do not add up to those positions where
//    they do not belongs to.
//    Note: for the last element n do not add anything to n+1 as it does not exists

//    TC=O(m+n) , m is length of array and n is number of flights
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans = new int[n];
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];

            ans[first-1] += seats; //bcz index is -1 of value of seat position.
            if(last<n) ans[last+1 - 1] -= seats; //bcz index is -1 of value of seat position.
        }
        //applying prefix sum on ans
        for(int i=1;i<n;i++){
            ans[i] += ans[i-1];
        }
        return ans; // 3 ms
    }

    //Brute Force 748 ms
    //TC=O()
    public int[] corpFlightBookings1(int[][] arr, int n) {
        int[] ans = new int[n];
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];

            for(int j=first-1;j<=last-1;j++){ //bcz indexes are 1 less than the seat number
                ans[j] += seats;
            }
        }
        return ans;
    }

}
