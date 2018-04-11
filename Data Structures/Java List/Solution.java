
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // Get the size of the list
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // Create list
        List<Integer> L = new ArrayList<>(N);

        for (int i = 0; i < N; i++){
            L.add(in.nextInt());
        }

        // Get number of Queries
        int Q = in.nextInt();
        in.nextLine();

        for (int i = 0; i<Q; i++){
            // Perform Queries
            String command = in.next();

            switch (command.toUpperCase()){
                case "INSERT":
                    int x = in.nextInt();
                    int y = in.nextInt();
                    L.add(x,y);
                break;

                case "DELETE":
                    int index = in.nextInt();
                    L.remove(index);
                break;
            }

        }

        in.close();

        // print result
        for(int i : L){
            System.out.printf("%d ",i);
        }
    }

}

