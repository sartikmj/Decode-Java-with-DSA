package TreeSetsAndTreeMaps.TreeMaps.Basics;

import java.util.TreeMap;

public class Basic {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("Raghav",76);
        map.put("Himanshu",83);
        map.put("Amritanshu",13);
        map.put("Ayushi",82);
        map.put("Prachi",88);

        for(String key : map.keySet()){
            System.out.print(key+" "+map.get(key)+"   ");
        }
    }
}
