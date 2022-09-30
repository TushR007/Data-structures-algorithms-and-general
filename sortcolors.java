public class sortcolors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int l=0,m=0,h=nums.length-1;

        while(m<=h){
            int val = nums[m];
            if(val == 0){
                swap(nums,l,m);
                l++;m++;
            }
            if(val == 1){
                m++;
            }
            if(val == 2){
                swap(nums,m,h);
                h--;
            }
        }

        for(int e:nums){
            System.out.println(e);
        }
    }

    public static void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
