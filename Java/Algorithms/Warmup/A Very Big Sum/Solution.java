import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] A = new long[N];
        long sum = 0;
        for (int i = 0; i < N; ++i) {
            A[i] = scan.nextLong();
            sum += A[i];
        }
        System.out.println(sum);
    }
}
