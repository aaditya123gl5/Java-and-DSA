package Array2;

public class TwoPointer
{
    public static boolean isPairSum(int A[], int N, int X)
    {
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (A[i] + A[j] == X)
                return true;
            else if (A[i] + A[j] < X)
                i++;
            else
                j--;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int arr[] = {3, 5, 9, 2, 8, 10, 11};
        int val = 17;
        int arrSize = arr.length;
        System.out.println(isPairSum(arr, arrSize, val));
    }
}