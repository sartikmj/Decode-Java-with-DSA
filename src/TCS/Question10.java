package TCS;

import java.util.HashMap;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalIncome = sc.nextInt();
        sc.nextLine(); // to consume next line

        HashMap<String,Integer> map = new HashMap<>();

        int totalExpense = 0;

        while(true){
            String category = sc.nextLine();
            if(category.equals("done")){
                break;
            }

            int expense = sc.nextInt();
            sc.nextLine();// to consume next line

            map.put(category, map.getOrDefault(category,0)+ expense);
            totalExpense += expense;
        }

        System.out.println(totalIncome);
        System.out.println(totalExpense);
        System.out.println(totalIncome - totalExpense);

        for(String category : map.keySet()){
            System.out.println(category + ";" +map.get(category));
        }
        sc.close();
    }
}
