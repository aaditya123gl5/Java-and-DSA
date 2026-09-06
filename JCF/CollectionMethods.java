package JCF;

import java.util.*;

public class CollectionMethods {
    Collection<Integer> c = new ArrayList<>();

    // 1. size() - Returns the number of elements.
    int n = c.size();


    // 2. isEmpty() - Checks whether the collection is empty.
    boolean empty = c.isEmpty();


    // 3. contains(Object o) - Checks whether the specified element exists.
    boolean present = c.contains(2);


    // 4. iterator() - Returns an Iterator to traverse the collection.
    Iterator<Integer> itr = c.iterator();


    // 5. toArray() - Converts the collection into an Object array.
    Object[] obj = c.toArray();


    // 6. toArray(T[] a) - Converts the collection into a typed array.
    Integer[] arr = c.toArray(new Integer[0]);


    // 7. add(E e) - Adds an element to the collection.
    boolean added = c.add(4);


    // 8. remove(Object o) - Removes the specified element.
    boolean removed = c.remove(4);


    // 9. addAll(Collection<? extends E>) - Adds all elements of another collection.
    boolean addAll = c.addAll(List.of(5, 6, 7));


    // 10. containsAll(Collection<?>) - Checks whether all specified elements exist.
    boolean containsAll = c.containsAll(List.of(1, 2));


    // 11. removeAll(Collection<?>) - Removes all elements present in another collection.
    boolean removeAll = c.removeAll(List.of(1, 2));


    // 12. retainAll(Collection<?>) - Retains only common elements (intersection).
    boolean retainAll = c.retainAll(List.of(2, 3));


    // 13. equals(Object o) - Compares two collections for equality.
    boolean equal = c.equals(new ArrayList<>());


    // 14. hashCode() - Returns the hash code of the collection.
    int hash = c.hashCode();
    
}
