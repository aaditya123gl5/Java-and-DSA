package JCF;

import java.util.*;

public class TreeMapMethods {
    public static void main(String[] args) {

        // TreeMap stores keys in sorted order.
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Aditya");
        map.put(102, "Rohit");
        map.put(103, "Rohan");
        map.put(105, "Aman");
        map.put(107, "Vikas");

        System.out.println("Map: " + map);

        // firstKey()
        // Smallest key.
        System.out.println("firstKey: " + map.firstKey());


        // lastKey()
        // Largest key.
        System.out.println("lastKey: " + map.lastKey());


        // firstEntry()
        // Entry having the smallest key.
        System.out.println("firstEntry: " + map.firstEntry());


        // lastEntry()
        // Entry having the largest key.
        System.out.println("lastEntry: " + map.lastEntry());


        // Comparator()
        // Returns comparator used for ordering.
        // null means natural ordering is being used.
        System.out.println("comparator: " + map.comparator());


        // subMap(fromKey, toKey)
        // fromKey INCLUDED
        // toKey EXCLUDED
        System.out.println("subMap(102, 105): "+ map.subMap(102, 105));


        //  headMap(toKey)
        // Keys smaller than toKey.
        System.out.println("headMap(105): "+ map.headMap(105));


        //  tailMap(fromKey)
        // fromKey and all greater keys.
        System.out.println("tailMap(103): "+ map.tailMap(103));

        // higherKey(key)
        // Smallest key STRICTLY greater than given key.
        System.out.println("higherKey(102): "+ map.higherKey(102));


        //  lowerKey(key)
        // Largest key STRICTLY smaller than given key.
        System.out.println("lowerKey(102): "+ map.lowerKey(102));


        //  ceilingKey(key)
        // Smallest key GREATER THAN OR EQUAL TO given key.
        System.out.println("ceilingKey(102): "+ map.ceilingKey(102));


        // floorKey(key)
        // Largest key LESS THAN OR EQUAL TO given key.
        System.out.println("floorKey(102): "+ map.floorKey(102));


        // higherEntry(key)
        System.out.println("higherEntry(102): "+ map.higherEntry(102));


        // lowerEntry(key)
        System.out.println("lowerEntry(102): "+ map.lowerEntry(102));


        //  ceilingEntry(key)
        System.out.println("ceilingEntry(102): "+ map.ceilingEntry(102));


        //floorEntry(key)
        System.out.println("floorEntry(102): "+ map.floorEntry(102));

        // POLL METHODS
       

        //  pollFirstEntry()
        // Removes and returns the first/smallest entry.
        // System.out.println(map.pollFirstEntry());


        // pollLastEntry()
        // Removes and returns the last/largest entry.
        // System.out.println(map.pollLastEntry());

        // REVERSE ORDER METHODS
       
        // descendingMap()
        // Returns map in descending key order.
        System.out.println("descendingMap: "+ map.descendingMap());


        // descendingKeySet()
        // Returns keys in descending order.
        System.out.println("descendingKeySet: "+ map.descendingKeySet());


        //  navigableKeySet()
        System.out.println("navigableKeySet: "+ map.navigableKeySet());


        // replace()
        map.replace(101, "Sonu");


        // replace(key, oldValue, newValue)
        map.replace(102, "Rohit", "Mohit");


        //  remove(key)
        map.remove(108);


        // remove(key, value)
        map.remove(107, "WrongValue");
        map.remove(107, "Vikas");

        // putAll()
        TreeMap<Integer, String> map2 = new TreeMap<>();

        map2.put(109, "Karan");
        map2.put(110, "Arjun");

        map.putAll(map2);

        // entrySet() + getKey() + getValue()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        System.out.println("Final Map: " + map);
    }
}
