package Strings.StringBuilder.BuiltInFunctions;

public class append {
    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder("Sartik");
        StringBuilder sb = new StringBuilder("Sartik");
        System.out.println(sbr.length());

        //reverse , to reverse the StringBuilder
        System.out.println(sbr.reverse());

        //append , to add a String at the of the StringBuilder
        sb.append("_Sharma"); //string
        System.out.println(sb);

        sb.append(404); //int
        System.out.println(sb);
        sb.append('*'); //character
        System.out.println(sb);

        char[] ch = {'r','a','g','h','a','v'};

        sb.append(ch); //array of characters , will append as a string

        System.out.println(sb);

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//
//        sb.append(arr); //array of integers , address of the Array will be appended
// // we have to use toString method
//        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Sartik");

        sb.append(sb1); //StringBuilder

        System.out.println(sb);

//        sb+="sdfd"; //not possible
    }
}
