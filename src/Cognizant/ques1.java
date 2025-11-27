package Cognizant;

public class ques1 {

    public static int lucky(String s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            int index = i+1;
            int ch = s.charAt(i);
            int product = (int)ch * index;
            if((int)ch%2!=0 || index%2!=0) sum+=product;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "sartik";
        System.out.println(lucky(s));
    }
}
