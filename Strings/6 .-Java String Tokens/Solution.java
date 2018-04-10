import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        s = s.trim();
        if (!s.isEmpty()){
            String[] tokens = s.split("[\\s!,?._'@]+");

            System.out.println(tokens.length);

            for (String string: tokens){
                System.out.println(string);
            }
        } else {
            System.out.printf("%d\n", 0);
        }
        
    }
}

