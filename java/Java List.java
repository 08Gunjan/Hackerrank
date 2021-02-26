import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void insert(int ind, int num, List list)
    {    if(ind>=0 && ind<list.size())
         list.add(ind,num);
         else if(ind==list.size())
         list.add(num);
    }
    
     public static void delete(int ind, List list)//
    {     if(ind>=0 && ind<list.size())
           list.remove(ind);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int ind,num;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int ele = sc.nextInt();
            list.add(ele);
        }
        int q = sc.nextInt();
        while(q>0)
        {   sc.nextLine();
            String query = sc.nextLine();
            if(query.equals("Insert"))
            {
                    ind = sc.nextInt();
                    num = sc.nextInt();
                insert(ind, num, list);
            }
            if(query.equals("Delete"))
            {
                  ind = sc.nextInt();
                  delete(ind, list);
            }
            q--;
        }
        for(int element : list)
        {
            System.out.print(element+" ");
        }
        
    }
}
