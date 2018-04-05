import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] array = new String[s.length() - (k - 1)];

        for (short i = 0; i <= ((s.length()) - k); i++){
            array[i] = s.substring(i, k + i);
        }

        smallest = array[0];
        largest = array[0];

        for (String string: array) {

            boolean smallestFlag = false;
            boolean largestFlag = false;

            for (short n = 0; n < string.toCharArray().length; n++){

                if (string.charAt(n) != smallest.charAt(n) && smallestFlag == false) {
                    if (string.charAt(n) < smallest.charAt(n)) {
                        smallest = string;
                    }
                    smallestFlag = true;
                }

                if (string.charAt(n) != largest.charAt(n) && largestFlag == false){
                    if (string.charAt(n) > largest.charAt(n)) {
                        largest = string;
                    }
                    largestFlag = true;
                }
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

