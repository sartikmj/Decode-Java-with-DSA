package TwoDImensionalArrayList.Basics;
import java.util.ArrayList;
public class basicSTLFunctions {
    public static void main(String[] args){
        //to use List for declaring ArrayList you need to import Library java.util.List;
        //to use ArrayList for declaring ArrayList you need to import Library java.util.ArrayList;

        //declaration of 1D ArrayList
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);

        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        d.add(60);
        //declaration of 2D ArrayList
        ArrayList<ArrayList<Integer>> l = new ArrayList<>(); //in this l , number of rows and columns both are zero
        //you can not add a number in l , you can only add an ArrayList in l

        l.add(a); l.add(b); l.add(c); l.add(d);
        //there are variable columns in this , l ArrayList

        //printing 2D ArrayList
        for(int i = 0 ; i<l.size() ; i++){
//            System.out.print(l.get(i)+" "); // printing the ArrayList , // get() method is used to get elements of ArrayList
            // ArrayList<Integer> x = l.get(i); //one by one all the elements of the l ArrayList are put in ArrayList x and then print them
            // putting j<x.size() in loop and printing sout(x.get(j)+" ");
            for(int j = 0 ; j< l.get(i).size(); j++){  // l.get(i).size() different no. of column with their respective rows.
                System.out.print(l.get(i).get(j)+" ");
            }
        }
        //to print individual element
//        System.out.print(l.get(1).get(1));
//      //but the array list have variable columns for each row
    }
}
