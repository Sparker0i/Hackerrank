import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        int[][] a = new int[6][6];
        int hmax = -32767;              //Initialize it to lowest integer possible
        try (Scanner scanner = new Scanner(System.in);)
        {
            for(int i = 0; i < 6; i++)
            {
                for(int j = 0; j < 6; j++)
                {
                    a[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1)
                    {
                        int hsum =
                            a[i][j]
                            + a[i][j-1]
                            + a[i][j-2]
                            + a[i-1][j-1]
                            + a[i-2][j]
                            + a[i-2][j-1]
                            + a[i-2][j-2];
                        if (hsum > hmax) {hmax = hsum;}
                    }
                }
            }
        }
        System.out.println(hmax);
    }
}
