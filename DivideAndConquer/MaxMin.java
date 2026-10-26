package DivideAndConquer;

public class MaxMin {
    int[] a = {8,12,0,-6,15,20,3,64,11};
    int maximum, minimum;
    public static void main(String[] args) {

        MaxMin obj = new MaxMin();

        obj.findMaxMin(0, 8);

        System.out.println("Maximum element: " + obj.maximum);
        System.out.println("Minimum element: " + obj.minimum);
    }

    void findMaxMin(int i, int j) {

        if (i == j) {
            maximum = a[i];
            minimum = a[i];
        }

        else if (i==j - 1) {

            if (a[i] < a[j]) {
                maximum = a[j];
                minimum = a[i];
            } else {
                maximum = a[i];
                minimum = a[j];
            }
        }

        else {
            int mid = (i + j)/2;

            findMaxMin(i, mid);

            int max1 = maximum;
            int min1 = minimum;

            findMaxMin(mid + 1, j);

            int max2 = maximum;
            int min2 = minimum;

            if (max1 > max2) {
                maximum = max1;
            } else {
                maximum = max2;
            }

            if (min1 < min2) {
                minimum = min1;
            } else {
                minimum = min2;
            }
        }
    }
}

