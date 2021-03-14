import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int sa=0;
        int[][] arr = new int[h+2][w+2];
        for(int i=0;i<h+2;i++)  //filling the array of h+2 and w+2 with 0
        {
            for(int j=0;j<w+2;j++)
            {
                arr[i][j]=0;
            }
        }
        
        for(int i=1; i<h+1; i++) //scanning the actual array to be calculated
        {
            for(int j=1; j<w+1; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
         
         sa = 2*h*w; // surface area of top and botton
                     // because both will be visible
         
        for(int i=1; i<h+1; i++)
        {
            for(int j=1; j<w+1; j++)
            {    //for every cube, examine the four lateral sides
            
                 //if side is greater it means it is visible 
                 
                if(arr[i][j]>arr[i-1][j]) //1 side
                {
                    sa = sa+ (arr[i][j]-arr[i-1][j]);  //to calculate the visible area
                } 
                if(arr[i][j]>arr[i+1][j]) //2 side
                {
                    sa = sa+ (arr[i][j]-arr[i+1][j]); //to calculate the visible area
               }
               if(arr[i][j]>arr[i][j-1]) // 3 side
                {
                    sa = sa+ (arr[i][j]-arr[i][j-1]); //to calculate the visible area
                } 
                if(arr[i][j]>arr[i][j+1]) // 4 side
                {
                    sa = sa+ (arr[i][j]-arr[i][j+1]); ////to calculate the visible area
                } 
            }   
        }
        System.out.println(sa);
        
    }
}
