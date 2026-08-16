package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = new ArrayList<>();

        //Create the first inner list
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        firstRow.add(2);

        //Create the second inner list
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(3);
        secondRow.add(4);
        secondRow.add(5);

        //Add the inner lists into the outer list
        nestedList.add(firstRow);
        nestedList.add(secondRow);

        // Print the complete nested list: [[1, 2], [3, 4, 5]]
        System.out.println(nestedList); 
    }
}
