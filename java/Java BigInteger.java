import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b =sc.nextLine();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger res1 = A.add(B);
        BigInteger res2 = A.multiply(B);
        System.out.println(res1);
        System.out.println(res2);
    }
}
