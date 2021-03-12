import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    public static long taumBday(long b, long w, long bc, long wc, long z) {
    // Write your code here
     long bcost = b*bc;
     long wConvertB = b*(wc+z);
     long f1 = (bcost>wConvertB)? wConvertB:bcost;
     long wcost = w*wc;
     long bConvertW = w*(bc+z);
     long f2 = (wcost>bConvertW)? bConvertW:wcost;
     long sum= f1+ f2;
     
      return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            long b = Long.parseLong(firstMultipleInput[0]);

            long w = Long.parseLong(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            long bc = Long.parseLong(secondMultipleInput[0]);

            long wc = Long.parseLong(secondMultipleInput[1]);

            long z = Long.parseLong(secondMultipleInput[2]);

            long result = Result.taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
