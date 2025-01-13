package Strings.BasicQuestions;
import java.util.Scanner;
public class allSubstrings {
    // Print all the substrings of the string
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i =0;i<str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
