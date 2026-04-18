package HashmapsAndHashsets.HashMap.Questions;

public class CountNicePairsInAnArray {

    //Optimal




    //Brute Force

    //TC=O(n2) , SC=O(1)
    public int rev(int n){
        int r = 0;
        while(n!=0){
            r = r*10 + n%10;
            n/=10;
        }
        return r;
    }
    public int countNicePairsBrute(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){ //n-1 bcz we are forming pairs
            for(int j=i+1;j<n;j++){
                if(nums[i]+rev(nums[j]) == nums[j]+rev(nums[i])){
                    count++;
                }
            }
        }
        return count;
    }
}
