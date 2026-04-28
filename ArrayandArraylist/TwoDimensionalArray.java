package ArrayandArraylist;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for(int rows = 0; rows <= n-1; rows++)
    {
        for(int cols = 0; cols <= m-1; cols++)
        {
            arr[rows][cols] = scn.nextInt();
        }
    }

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<m; j++)
        {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
     scn.close();
    
    }
   
}
