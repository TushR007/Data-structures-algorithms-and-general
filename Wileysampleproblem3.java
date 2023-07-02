import java.util.Scanner;

public class Wileysampleproblem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }

        int x = s.nextInt();
        int s1 = 0,j2 = 0;

        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == x){
                    s1 = i+j;
                    j2 = j;
                }
            }
        }

        int num = arr[s1+1][j2];
        int val = 0;
        while(num!=0){
            int r = num%10;
            val = val + r;
            num/=10;
        }

        System.out.println(val);
    }
}
