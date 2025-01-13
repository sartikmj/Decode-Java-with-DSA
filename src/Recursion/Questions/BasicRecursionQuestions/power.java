package Recursion.Questions.BasicRecursionQuestions;

public class power {
    //make a function that returns a raise to the power b
    public static int powerLinear(int a,int b){
        if(b==0) return 1; //as anything raise to power 0 is 1
        else return a*powerLinear(a,b-1);

        //Time Complexity = O(b);
    }

    public static int powerLog(int a,int b){
        if(b==0) return 1;
        int ans = powerLog(a,b-1);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;

        // TC = O(log b)
    }

    public static void main(String[] args){
        System.out.println(powerLinear(2,3));
        System.out.println(powerLog(2,3));
    }
}
