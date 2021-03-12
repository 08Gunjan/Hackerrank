
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String appendAndDelete(String s, String t, int k)
    {
       int t4=Math.min(s.length(),t.length());
       int count=0;
       for(int i=0;i<t4;i++)
       {  
           if(s.charAt(i)!=t.charAt(i))
           {
              break; 
           }
           else
           {
               count++;
           }
       }
       int temp=0;
       int difference=s.length()-count+t.length()-count;
       if((k>=difference &&k%2==difference%2)||(k>=s.length()+t.length()))
       {
           return "Yes";
       }
       else
       {
           return "No";
       }
      
        }

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


   
