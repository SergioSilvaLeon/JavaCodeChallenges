import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        try{
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println(x/y);

        }catch(InputMismatchException ime){
	       System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
}
