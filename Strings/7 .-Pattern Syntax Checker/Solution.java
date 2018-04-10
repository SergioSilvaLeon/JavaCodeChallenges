import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] patterns = new String[testCases];
        for (short i = 0; i < patterns.length; i++) {
            patterns[i] = in.nextLine();
        }

        for (String s :patterns) {
            try{
                Pattern.compile(s);
                System.out.println("Valid");
            }catch(PatternSyntaxException pse){
                System.out.println("Invalid");
            }
        }
   }
}

