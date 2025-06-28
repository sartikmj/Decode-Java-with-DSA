package Strings.StringBuilder.Questions;

public class reverseWords {
    //Reverse the particular words of the sentence
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I am Sartik Sharma");
        int i=0,j=0;
        while(j<sb.length()){
            if(sb.charAt(j)!=' ') j++;
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1); //to reverse the last word, bcz loop ends before reversing last word , so we have to do it explicitly

        System.out.println(sb);
    }

    public static void reverse(StringBuilder sb,int i,int j) {
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
//if there are multiple space between words just use another loop and take i where there is a character after spaces