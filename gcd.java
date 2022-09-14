import java.util.*;

public class gcd {
    public static void main(String[] args) {
        //EUCLIDEAN ALGORITHM
        int v = gcd(357,234);
       
       System.out.println(v);
   } 

   public static int gcd(int a,int b) {
       if (b == 0){
           return a;
       }

       int c = a%b;

       return gcd(b,c);
   }
       
   
}
