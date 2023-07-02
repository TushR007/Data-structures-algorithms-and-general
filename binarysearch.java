public class binarysearch{
    public static void main(String[] args){
        int[] a = {-1,0,3,5,9,12};
        int target = 5;

        int start=0,stop=a.length-1;
        int mid = (start+stop)/2;

        while(start<=stop){

            if(a[mid] == target){
                System.out.println(mid);
                return;
            } 
            if(a[mid] < target){
                start = mid+1;
            } 
            if(a[mid] > target){
                stop = mid-1;
            } 

            mid = (start+stop)/2;
        }

        System.out.println("Not Found");


    }
}