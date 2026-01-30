package BitManipulation.Basics;

import java.util.Scanner;

public class PowerOf2 {

    //Given n find 2^n

    public static void main(String[] args) {
        //other two methods are
        // a^b = a*a^b-1 -> Recursive O(n)
        // a^b = a^b/2 * a^b/2 * a -> Binary Exponentiation O(nlogn)

        //2^n has a speciality that there is only one 1 in left most bit all other are 0s
        //So we can just left shift and we will get raise to the power 2
        //O(1)

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(1<<n);// 2^n

    }
}
