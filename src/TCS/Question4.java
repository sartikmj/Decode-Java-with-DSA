package TCS;

import java.util.HashMap;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String start = sc.nextLine();
        sc.nextLine(); // to eat lines

        String[] days = {"mon","tue","wed","thu","fri","sat","sun"};

        int index = 0; //index of the starting day
        for(int i=0;i<7;i++){
            if(start.equals(days[i])){
                index = i;
                break;
            }
        }

        int count = 0;

        //simulate n days
        for(int day=0;day<n;day++){

            int currentDay = (index+day)%7; //each week simulation

            // as 6 is sunday
            if(currentDay==6){
                count++;
            }
        }

        System.out.println(count);
    }
}
