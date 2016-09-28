import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int A[] = new int[N] , sum = 0;
        for (int i = 0; i < N; ++i) {
            A[i] = scan.nextInt();
            sum += A[i];
        }
        System.out.println(sum);
    }
}
