package TCS.KNAcademy.Arrays.Easy;

import java.util.Scanner;


// GOOD QUESTION

public class Question3 {

    // A Digital vault in CyberRealm stores commands in an encoded binary string.
    // The string consists of binary digits separated by operation codes:
    // A -> AND
    // B -> OR
    // C -> XOR
    // The vault processes the string strictly from left to right, performing one operation at a time, ignoring conventional
    // operator precedence.
    // If string is NULL, return -1
    // Determine the final binary result

    //Case 1:
    //Input: 1C0C1C1A0B1
    //Output: 1

    //Case 2:
    // Input: 0A1B1C1
    // Output: 0

    //Case 3: (Single Digit)
    //Input: 1
    //Output: 1

    //Case 4: (NULL CASE)
    // Input: NULL
    // Output: -1


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s==null || s.equals("NULL")){
            System.out.println(-1);
            return;
        }

        if(s.length()==1){
            System.out.println(s);
            return;
        }

        int res = s.charAt(0) - '0';

        for(int i=1;i<s.length();i+=2){

            char op = s.charAt(i); //operator
            int next = s.charAt(i+1)-'0'; //next operand, first operand is the res itself

            if(op=='A') res = res & next;
            else if(op=='B') res = res | next;
            else if(op=='C') res = res ^ next;
        }

        System.out.println(res);
    }
}
