import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k , p = 0, n = 0, z = 0;
        for (int i = 0; i < N; ++i) {
            k = scan.nextInt();
            if (k > 0)
                ++p;
            else if (k < 0)
                ++n;
            else
                ++z;
        }
        System.out.println((float) p/N);
        System.out.println((float) n/N);
        System.out.println((float) z/N);
    }
}
