import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the counterGame function below.
    static String counterGame(long n) {
    long t=n;
    long i=1,c=0;
    while(i<=t/2)
    {
        if(n==1)
        break;
        if(Math.pow(2,i)==n)
        {
            n=n/2;
            c++;
            i=0;
        }
        if(Math.pow(2,i)>n)
        {
            long no=(long)Math.pow(2,i-1);
            n=n-no;
            c++;
            i=0;
        }
        i++;
    }
    if(c%2==0)
    return"Richard";
    else
    return"Louise";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = counterGame(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
