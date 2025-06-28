package HashmapsAndHashsets.HashMap.Basics;

import java.util.HashMap;

public class BasicMap {
    public static void main(String[] args) {
        //Declaration
        HashMap<String, Integer> map = new HashMap<>();
            //  Key      Value
        //Insertion
        map.put("Sartik",58);
        map.put("Nishant",59);
        map.put("Harry",60);

        System.out.println(map);

        //methods
        System.out.println(map.containsKey("Sartik"));

        System.out.println(map.containsValue(99));

        //keys are unique, if another value is added with existing key it will overwrite the existing key's value.
        //but there can be same values for different keys

        map.put("Sartik",99); //it will replace the 58
        map.put("tanish",58); //it will be added to the map

        System.out.println(map);
    }
}
