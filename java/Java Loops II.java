import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ex=0;
        for(int j=0;j<n;j++){
             ex+=Math.pow(2,j)*b;
             int ans=a+ex;
             System.out.print(ans+ " ");
        }
        System.out.println();
        }
        
        in.close();
    }
}
