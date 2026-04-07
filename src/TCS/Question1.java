package TCS;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //monkeys
        int k = sc.nextInt(); // eatable bananas
        int j = sc.nextInt(); // eatable Peanuts
        int m = sc.nextInt(); // total bananas
        int p = sc.nextInt(); // total peanuts

//        int monkeysDown = (int)Math.ceil((double)m/k) + (int)Math.ceil((double)p/j);

//        OR

        int bananaEat = m/k;
        int remainingBanana = m%k;

        int peanutEat = p/j;
        int remainingPeanut = p%k;

        int leftMonkey = n - (bananaEat + peanutEat);

        if(remainingPeanut!=0 || remainingBanana!=0) leftMonkey--;

        System.out.println(leftMonkey);
    }
}
