import java.util.*;

public class rotatearray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        rotate(nums,3);

        for(int i : nums){
            System.out.println(i);
        }

    }

    public static void rotate(int[] nums,int k) {
        
        if(nums.length<2){
            return;
        }

        k = k%nums.length;//because if k>length of array if arr = [1,2] and k=3 , then rotation val actually is 1.

        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    public static void reverse(int[] nums,int start, int end) {
        int temp;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;end--;
        }
    }
}
