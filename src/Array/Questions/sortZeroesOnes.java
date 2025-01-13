package Array.Questions;

public class sortZeroesOnes {


    //Method-2: One-Pass
    //1. Use two pointer with some particular conditions.
    // NOTE -> using else if is very imp do not use multiple if statements it will produce wrong output.
    public static void Method2(int[] arr){
        int i = 0, j =arr.length-1;
        while(i<j){ // if condition is i<=j it will give an error
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
            else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
        }
    }

    //Method-1: Two-Pass
    //1. Count number of 0s and 1s , calculate no. of 0s then no. of 1s = len-no. of 0s
    //2. Update the array with 0s and 1s , pehle utne zeroes ko starting m laga do fir waha se aage 1s laga do.
    public static void Method1(int[] arr){
        int noOfZeroes = 0 ;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) noOfZeroes++;
        }

        for(int i=0;i<arr.length;i++){
            if(i<noOfZeroes) arr[i]=0;
            else arr[i]=1;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,0,1,1,0,1,0};
//        Method1(arr);
        Method2(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
