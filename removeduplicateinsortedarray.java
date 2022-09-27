

public class removeduplicateinsortedarray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,3,4,5,6,7,7,7,7,8,8};
        int[] arr1 = new int[arr.length];

        int i = 0;

        for(int n: arr){
            if(i == 0 || n > arr[i-1]){
                arr1[i++] = n;
            }
        }

        for(int e: arr1){
            System.out.print(e + "");
        }
    }
}
