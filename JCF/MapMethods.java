package JCF;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
       // 1. Default constructor
        HashMap<Integer, String> map1 = new HashMap<>();

        // 2. Constructor with initial capacity
        HashMap<Integer, String> map2 = new HashMap<>(100);

        // 3. Constructor with initial capacity and load factor
        HashMap<Integer, String> map3 = new HashMap<>(100, 0.8f);

        // 4. Constructor using another Map
        HashMap<Integer, String> map4 = new HashMap<>(map1);

        // 1. put(key, value)
        // Adds a new key-value pair.(If key already exists, its value is replaced.)
        map1.put(101, "Aditya");
        map1.put(102, "Rohit");
        map1.put(103, "Rohan");

        System.out.println("Map: " + map1);


        // 2. get(key)
        System.out.println("get(101): " + map1.get(101));


        // 3. getOrDefault(key, defaultValue)
        // Returns value if key exists otherwise default value
        System.out.println(map1.getOrDefault(105, "Unknown"));


        // 4. putIfAbsent(key, value)
        // Adds value only if key is not already present.
        map1.putIfAbsent(103, "Abhay"); // Does NOT replace Rohan
        map1.putIfAbsent(104, "Karan"); // Adds 104


        // 5. containsKey(key)
        System.out.println(map1.containsKey(101));


        // 6. containsValue(value)
        System.out.println(map1.containsValue("Rohit"));


        // 7. size()
        System.out.println("size: " + map1.size());


        // 8. isEmpty()
        System.out.println("isEmpty: " + map1.isEmpty());


        // 9. keySet()
        // Returns all keys as a Set.
        System.out.println("keySet: " + map1.keySet());


        // 10. values()
        // Returns all values as a Collection.
        System.out.println("values: " + map1.values());


        // 11. entrySet()
        // Returns all key-value pairs.
        System.out.println("entrySet: " + map1.entrySet());

        // ITERATING THROUGH HASHMAP
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " -> " + value);
        }

       // 12. replace(key, newValue)
       // Replaces value if key exists.
        map1.replace(101, "Sonu");


        // 13. replace(key, oldValue, newValue)
        // Replaces only if current value matches oldValue.
        map1.replace(102, "Rohit", "Mohit");

        // 14. remove(key)
        // Removes mapping using key.
        map1.remove(104);


        // 15. remove(key, value)
        // Removes only if both key AND value match.
        map1.remove(103, "WrongValue"); // Not removed
        map1.remove(103, "Rohan");      // Removed


        // 16. putAll(map)
        // Copies all mappings from another map.
        HashMap<Integer, String> anotherMap = new HashMap<>();

        anotherMap.put(105, "Aman");
        anotherMap.put(106, "Vikas");

        map1.putAll(anotherMap);



        // MAP.ENTRY METHODS

        // 17. getKey()
        // 18. getValue()
        // 19. setValue()

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {

            if (entry.getKey() == 105) {
                entry.setValue("Aman Kumar");
            }
        }

        // 20. clear()
        // Removes all mappings.
        // map1.clear();

        // 21. equals()
        System.out.println("map1 equals map2: "
                + map1.equals(map2));


        // 22. hashCode()
        // Returns hash code of the map.
        System.out.println("hashCode: " + map1.hashCode());


        System.out.println("Final Map: " + map1);
    }
}
