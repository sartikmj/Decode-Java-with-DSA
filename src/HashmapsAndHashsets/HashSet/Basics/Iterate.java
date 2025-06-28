package HashmapsAndHashsets.HashSet.Basics;

import java.util.HashSet;
public class Iterate {
    public static void main(String[] args) {

        int[] arr = {4,9,2,6,4,8,1};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);

        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();

        //you can't add or remove something using iteration it will generate error

        //we can use a built in method to delete all the ele in set

        set.clear();
        System.out.println("the set is empty"+set);
    }
}
