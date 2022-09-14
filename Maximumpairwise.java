import java.util.Scanner;

class Maximumpairwise{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i = 0;i<n; i++){
            ar[i]=s.nextInt();
        }
        System.out.println(maxpair(ar));
    }

    public static long maxpair(int[] arr){

        int res = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                int p = arr[i]*arr[j];
                if( p > res){
                    res = p;
                }
            }
        }

        return res;
    }
}