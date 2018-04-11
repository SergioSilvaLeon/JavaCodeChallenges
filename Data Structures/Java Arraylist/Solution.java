import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        // Get rows
        int rows = in.nextInt();

        // Create array list
        List<List<Integer>> rowList = new ArrayList<>();

        for(int i =0; i< rows; i++){

            // columns
            int columns =  in.nextInt();

            // create column
            List<Integer> column = new ArrayList<>();

            int columnNumber;

            for (int c = 0; c < columns; c++){
                columnNumber = in.nextInt();
                column.add(columnNumber);
            }

            rowList.add(column);
        }

        // Create a seach array;

        int searchTotal = in.nextInt();

        // create array to store results
        int[] results = new int[searchTotal];

        int x;
        int y;
        for (int i = 0; i < searchTotal; i++) {
            // read x,y and perform search
            x = in.nextInt();
            y = in.nextInt();

            results[i] = searchPair(x,y, rowList);
        }

        for (int i: results){
            if (i == -1000000000){
                System.out.println("ERROR!");
            }else {
                System.out.println(i);
            }
        }
    }

    // print results


    // Create search method that returns result
    private static int searchPair(int x, int y, List<List<Integer>> matrix) {
        try {
            return matrix.get(x - 1).get(y - 1);
        }catch (IndexOutOfBoundsException iobe){
            return -1000000000;
        }
    }


}
