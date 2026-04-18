package Numbers;

import java.util.Scanner;

public class FindAllPalindromeNumbersInAGivenRange {

    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp/=10;
        }
        return rev == n;
    }

    public static void main(String[] args) {

//        Given a range of numbers, print all palindromes in the given range. For example if the given range is {10, 115},
//        then output should be {11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111}
//        We can run a loop from min to max and check every number for palindrome. If the number is a palindrome,
//        we can simply print it

        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        for(int i=min;i<=max;i++){
            if(isPalindrome(i)) System.out.print(i+" ");
        }
    }
}
