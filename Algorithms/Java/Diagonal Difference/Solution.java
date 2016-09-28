import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; ++i){
            for (int j = 0; j < N; ++j) {
                A[i][j] = scan.nextInt();
            }
        }
        int d1 = 0 , d2 = 0;
        for (int i = 0; i < N; i++)
        {
             int j = 0;
             while (j < N)
             {
                    if (i == j) d1 += A[i][j];
                    j++;
                    if (i == (N - j)) d2 += A[i][j - 1];
             }
        }
        int dif = d1 - d2;
        if (dif < 0)
            dif *= -1;
        System.out.println(dif);
    }
}
