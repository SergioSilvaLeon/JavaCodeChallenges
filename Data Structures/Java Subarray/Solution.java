import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Read Input
        Scanner in = new Scanner(System.in);

        // Get Size;
        int arrSize = in.nextInt();
        int[] arr = new int[arrSize];

        // get int
        for (int i = 0; i < arrSize; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        int negativeCount = 0;

        for (int i = 0; i < arrSize; i++) {
            int totalSum  = 0;
            for (int n = i +0; n < arrSize; n++){
                totalSum += arr[n];
                if (totalSum < 0)
                    negativeCount ++;
            }
        }

        System.out.println(negativeCount);
    }
}
