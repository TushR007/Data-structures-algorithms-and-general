public class movezerostoend {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int i = 0;

        for(int n : nums){
            if(n != 0){
                nums[i++] = n;
            }
        }

        for(int j = i; j<nums.length;j++){
            nums[j] = 0;
        }

        for(int n : nums){
            System.out.println(n);
        }

    }
}
