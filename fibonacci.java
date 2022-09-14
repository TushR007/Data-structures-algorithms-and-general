import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int[] arr = new int[n+1];
        // arr[0] = 0;
        // arr[1] = 1;
        

        // for(int i = 2; i<=n; i++){
        //     arr[i] = arr[i-1] + arr[i-2];
        // }
        //  System.out.println(arr[n]);

        System.out.println(rec(n));
    }

    public static int rec(int n){


        if(n<=1){
            return n;
        }

        return rec(n-1)+rec(n-2);
    }
}
