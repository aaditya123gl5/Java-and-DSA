package Array2;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scn.nextInt());
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                System.out.println("Missing number: " + i);
                break;
            }
        }
    }
}