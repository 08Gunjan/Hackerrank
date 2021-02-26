import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B = new StringBuilder(A);
        String c=B.reverse().toString();
        if(A.equals(c))
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}



