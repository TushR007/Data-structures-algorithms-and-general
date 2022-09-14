import java.math.BigInteger;
import java.util.*;

public class Maximumpairwisefast {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        BigInteger[] arr = new BigInteger[s];
        for(int i = 0;i<s; i++){
            arr[i] = scn.nextBigInteger();
        }

        System.out.println(maxpair(arr));
        
    }

    public static BigInteger maxpair(BigInteger[] arr) {
        int n = arr.length;
        int m1 = 0;
        for(int i = 1; i<n; i++){
            if(arr[i].compareTo(arr[m1]) == 1){
                m1 = i;
            }
        }

        int m2 = 0;
        for(int j = 1; j<n; j++){
            if(arr[j]!=arr[m1] && (arr[j].compareTo(arr[m2]) == 1)){
                m2 = j;
            }
        }

        
        return arr[m1].multiply(arr[m2]);
    }
}
