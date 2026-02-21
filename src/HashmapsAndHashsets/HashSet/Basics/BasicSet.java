package HashmapsAndHashsets.HashSet.Basics;

import java.util.HashSet;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); //It is an Interface

        //Insertion TC=O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println(set.size());
        set.add(-8);
        set.add(200);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(100);
        System.out.println(set); //printing TC=O(n)

        //Elements inside set are stored and printed randomly.

        //search -> true or false , TC=O(1)
        System.out.println(set.contains((50)));

        set.add(50);
        System.out.println(set.contains((50)));

        set.remove((1000));
        System.out.println(set); //removing something which does not exist, it does not return error

        //toArray
        Object[] arr = set.toArray(); //will become an Object datatype array, bcz of wrapper class Integer.

        for(Object o : arr) {
            System.out.print(o+" ");
        }
    }
}
