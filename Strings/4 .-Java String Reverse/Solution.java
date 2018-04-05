import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean anagram = false;

        // turn current word into reverse
        String newWord = "";

        for(int j = A.length(); j > 0;  j-- ) {
            newWord += A.charAt(j - 1);
        }

        // Compare each word with palindrom
        if (newWord.equals(A)){
            anagram = true;
        }

        System.out.println(anagram? "Yes": "No");
        
    }
}

