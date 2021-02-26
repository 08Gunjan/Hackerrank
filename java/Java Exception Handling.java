
import java.lang.*;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    // long power(int n,int p) throws Exception {
    //     if(n<0 || p<0){
    //         throw new Exception("n or p should not be negative.");
    //     }
    //     else if(n==0 && p==0){
    //         throw new Exception("n and p should not be zero.");
    //     }
    //   // else if(p==1)
    //    //return n;
    //    else
    //    return (long)Math.pow(n,p);         //n*power(n,p-1);             
    // }

    long power(int n,int p) throws Exception {
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
       else if(p==0)
       return 1;
       else if(p==1)
       return n;
       else
       return n*power(n,p-1);             //(long)Math.pow(n,p);
    }
    
}

