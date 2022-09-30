import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] a = new int[2];
        int target = 15;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int val = target-nums[i];

            if(map.containsKey(val)){
                a[0] = map.get(val);
                a[1] = i;
            }

            map.put(nums[i],i);
        }
    }
}
