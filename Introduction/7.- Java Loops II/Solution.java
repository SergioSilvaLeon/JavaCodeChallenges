import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        // write your code here
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        // Save result into array to print later
        String[] results = new String[t];

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < n; j ++){
                if (j == 0){
                    result = a;
                }
                result = ((int)Math.pow(2,j) * b) + result;
                sb.append(result + " ");
            }

            results[i] = sb.toString().substring(0, sb.length() - 1);

        }
        in.close();

        // Display Results
        for(String s: results) {
            System.out.println(s);
        }
    }
}

