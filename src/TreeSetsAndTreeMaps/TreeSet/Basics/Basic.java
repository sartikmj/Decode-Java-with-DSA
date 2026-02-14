package TreeSetsAndTreeMaps.TreeSet.Basics;

import java.util.TreeSet;

public class Basic {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);

        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
