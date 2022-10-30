public class kadanes {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int csum = nums[0];
        int osum = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i] > csum){
                csum = nums[i];
            }
            else{
                csum+=nums[i];
            }

            if(csum>osum){
                osum=csum;
            }
        }

        System.out.println(osum);
    }
}
