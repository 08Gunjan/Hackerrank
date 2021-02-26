import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void primeornot(int num)
    {   int i,flag=0;
        if(num==1)
        System.out.println("Not prime");
        else
        {
           for( i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i == 0){
                System.out.println("Not prime");
                flag=1;
                break;
            }
            
        }
        if(flag==0)
        System.out.println("Prime");  
        }
       
    }
  
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int num = sc.nextInt();
            primeornot(num);
            t--;
        }
    }
}
