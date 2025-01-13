package Strings.StringBuilder;

public class setCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
        sb.setCharAt(3,'s'); //change the character at 3rd index to s
        System.out.println(sb);
    }
}
