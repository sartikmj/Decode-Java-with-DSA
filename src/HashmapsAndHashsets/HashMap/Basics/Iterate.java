package HashmapsAndHashsets.HashMap.Basics;

import java.util.HashMap;

public class Iterate {
    public static void main(String[] args) {
        //Iteration of HashMap

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav",76);
        map.put("Hiamnshu",83);
        map.put("Amritanshu",13);
        map.put("Ayushi",83);
        map.put("Prachi",88);

        //iterating over keys
        for(String key : map.keySet()){
            System.out.println(key+ " "+ map.get(key)); //prints key + value of the key
//            System.out.print(map.get(key)+" "); //print values
        }
        System.out.println();

        //iterating over values
        for(int value : map.values()){
            System.out.print(value+" "); //prints all the values even the repetitive ones.
        }
        System.out.println();

//        map.values() -> returns a Collection view of all the values contained within the map.

        //3rd method for Iteration
        //Iterate over pairs

        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
