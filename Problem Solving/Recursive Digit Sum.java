import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //Complete the superDigit function below.
    static int y=0;
    static int superDigit(String n, int k) {
        int ans;
        if(n.length()==1) {
             ans = Integer.parseInt(n);
            return ans;
        }else{
         int i=0;
         long sum=0;
        while(i<n.length())
        {
           sum=sum+n.charAt(i)-'0';
            i++;
        }
            if(y==0)
            {
                y=1;
                sum=sum*k;
            }

        String s = String.valueOf(sum);
      ans=superDigit(s,k);  
    }
    
    return ans;
}
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
