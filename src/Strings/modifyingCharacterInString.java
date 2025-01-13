package Strings;

public class modifyingCharacterInString {
    //change 2nd index to y
    public static void main(String[] args){
        String s = "Hello";
        //changing to -> heylo
//        s.charAt(5) = 'y'; //wrong u can use this to set characters in string
        s = s.substring(0,2) + 'y' + s.substring(3);
        //2nd character has been changed
        System.out.println(s);

        //this way is not efficient
        //substring makes new string , it takes time and space

    }
}
