public class mergesortedarrays {
    public static int[] MargeTwoSortedArray(int[] array1, int[] array2) {
        final int[] mergedArray = new int[array1.length + array2.length];
        int j = 0, k = 0,i=0;

        while((i+j)<=mergedArray.length){
            if(i != array1.length && array1[i] < array2[j]){
                mergedArray[k] = array1[i];
                i++;
            }
            else if(j != array2.length && array1[i]>array2[j]){
                mergedArray[k] = array2[j];
                j++;
            }
            else{
                mergedArray[k++] = array1[i];
                mergedArray[k] = array2[j];
                i++;j++;
            }
            k++;
        }
       
        return mergedArray;
    }
      public static void main(String[] args) {
        int[] arr = MargeTwoSortedArray(new int[]{1,1,8,9,10}, new int[]{1,2,8,9,11,15,16});
        for(int e:arr){
            System.out.println(e);
        }
      }

}
