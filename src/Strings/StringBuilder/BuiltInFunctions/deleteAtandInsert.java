package Strings.StringBuilder.BuiltInFunctions;

public class deleteAtandInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");

        //to delete character at particular index
        sb.deleteCharAt(3); //element at index 3 will be deleted
        System.out.println(sb);
        //now index have changed since one element is removed , so other elements will shift

        //to delete a range of elements

        sb.append("xyz"); //abcefxyz

        //to delete elements from index 2 to 5
        sb.delete(2,6); //second index is exclusive
        System.out.println(sb); //abyz

        //abyz -> abgyz
        //to insert between indexes

        sb.setCharAt(2,'g'); //it will remove prev element at index 2 and set g there

        //we want to insert g at 2nd index , we will use insert()

        sb.insert(2,'g');

    }
}
