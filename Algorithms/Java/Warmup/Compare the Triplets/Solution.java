import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[] = new int[3] , B[] = new int[3] , a = 0, b = 0;
        for (int i = 0; i < 3; ++i){
            A[i] = in.nextInt();
        }
        for (int i = 0; i < 3; ++i){
            B[i] = in.nextInt();
        }
        for (int i = 0; i < 3; ++i){
            if (A[i] > B[i])
                ++a;
            else if (A[i] < B[i])
                ++b;
        }
        System.out.println(a + " " + b);
    }
}
