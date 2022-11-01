import java.util.*;
public class Wileysampleproblem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }

        int sum1,sum2,sum3;
        sum1 = sum2 = sum3 = 0;

        for(int i = 0;i<n;i+=2){
            sum1+=arr[i];
        }

        for(int i = 1;i<n;i+=2){
            sum2+=arr[i];
        }

        sum1 = sum1>sum2?sum1:sum2;

        for(int i = 0;i<n;i++){
            for(int j = i+2;j<n;j++){
                if((arr[i]+arr[j]) > sum3){
                    sum3 = arr[i]+arr[j];
                }
            }
        }

        System.out.println(sum1>sum3?sum1:sum3);

    }
}
