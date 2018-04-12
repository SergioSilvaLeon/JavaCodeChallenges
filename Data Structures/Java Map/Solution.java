//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        // Create Map
        Map<String,Integer> phoneBook = new HashMap<>(n);

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();

            // Store values inside map, name, phone
            phoneBook.put(name, phone);
        }

        // create an array of resultes to store
        List<String> results = new ArrayList<>();

        // Query
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phoneBook.containsKey(s)){
                int phoneNumber = phoneBook.get(s);
                results.add(String.format("%s=%d",s,phoneNumber));
            }else{
                results.add("Not found");
            }

        }

        for (String s: results){
            System.out.println(s);
        }
    }
}

