import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maximumPerimeterTriangle function below.
    static int[] maximumPerimeterTriangle(int[] sticks) {
     Arrays.sort(sticks);
     long res=0;
     int[] arr = new int[3];
     int[] neg = new int[1];
       neg[0]=-1;
     int n = sticks.length;
     for(int i=0; i<n-2; i++)
     {
         for(int j=i+1;j<n-1; j++)
         {
             for(int k=j+1; k<n; k++)
             {
                 if(sticks[j]+sticks[k]>sticks[i] && sticks[k]+sticks[i]>sticks[j] &&                        sticks[i]+sticks[j]>sticks[k])
                 {
                    long p = (long)sticks[i]+sticks[j]+sticks[k];
                    if(res<p)
                    {
                        res=p;
                        arr[0]=sticks[i];
                        arr[1]=sticks[j];
                        arr[2]=sticks[k];
                    }
                 }
             }
         }
     }
     
     if(res!=0)
       return arr;
     else
       return neg;

    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] sticks = new int[n];

        String[] sticksItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int sticksItem = Integer.parseInt(sticksItems[i]);
            sticks[i] = sticksItem;
        }

        int[] result = maximumPerimeterTriangle(sticks);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
