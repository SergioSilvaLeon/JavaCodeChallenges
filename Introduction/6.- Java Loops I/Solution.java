import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // Loop
        for(int i = 1; i < 11; i ++){
            int result = N * i;
            System.out.printf("%d x %d = %d\n", N, i,  result);
        }
    }
}
