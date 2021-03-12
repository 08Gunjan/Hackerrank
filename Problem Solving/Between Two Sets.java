import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int getTotalX(List<Integer> a, List<Integer> b)
     {
    // Write your code here
    List<Integer> li=new ArrayList<>();
    Collections.sort(b);
    Collections.sort(a);
    int min=b.get(0);
    int last_value=a.get(a.size()-1);
    int count=0;
    while(last_value<=min)//8<=16
    {
        int flag=0;
        for(int i=0;i<a.size()-1;i++)
        {
            if(last_value%a.get(i)!=0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            
            li.add(last_value);
        }
        last_value=last_value+a.get(a.size()-1);
    }
   //System.out.println(li);
 
     int div=1;
  
        
    while(div<=min)//8<=6
    {
    int flag2=0;
    for(int i=0;i<b.size();i++)
    {
        if(b.get(i)%div!=0)
        {
            flag2=1;
            break;
        }
    }
   
    if(flag2==0)
    {
                if(li.contains(div))
        {
            System.out.println(div);
            count++;
        }
    }
    div++;

    }
    return count;
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
