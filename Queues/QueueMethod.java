package Queues;
import java.util.*;

public class QueueMethod {
 public static void main(String[] args) {
    
    Queue<Integer> queue = new ArrayDeque<>();
        // ADD / ENQUEUE
        queue.add(10);            // Adds element, throws exception if failed
        queue.offer(20);          // Adds element, returns false if failed (Thread safe)
        queue.add(30);
        queue.offer(40);

        // ACCESS FRONT
        System.out.println(queue.element());  // Returns front, exception if empty
        System.out.println(queue.peek());     // Returns front, null if empty (Thread safe)

        // REMOVE FRONT
        System.out.println(queue.remove());    // Removes front, exception if empty
        System.out.println(queue.poll());      // Removes front, null if empty (Thread Safe)

        // SIZE
        System.out.println(queue.size());


        // CHECK EMPTY
        System.out.println(queue.isEmpty());


        // SEARCH
        System.out.println(queue.contains(30));


        // REMOVE SPECIFIC ELEMENT
        queue.remove(30);

        // ADD MULTIPLE ELEMENTS
        queue.addAll(Arrays.asList(50, 60, 70));


        // CHECK COMMON ELEMENTS
        System.out.println(queue.containsAll(Arrays.asList(50, 60)));


        // REMOVE MULTIPLE ELEMENTS
        queue.removeAll(Arrays.asList(50, 60));


        // RETAIN COMMON ELEMENTS
        queue.retainAll(Arrays.asList(20, 40));


        // CLEAR
        //queue.clear();

        // ITERATE
        for (int x : queue) {
            System.out.println(x);
        }

        // CONVERT TO ARRAY
        Object[] arr = queue.toArray();

        Integer[] arr2 = queue.toArray(new Integer[0]);
    }
}

