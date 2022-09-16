public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4};
        int n = arr.length;

        for(int i = 0;i<n;i++){
            for(int j = i;j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }

        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int i,int j,int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
