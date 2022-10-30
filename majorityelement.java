import java.util.HashMap;

public class majorityelement {
    public static void main(String[] args) {
            int[] nums = {2,2,1,1,1,2,2};
            HashMap<Integer,Integer> map = new HashMap<>();
            int max = 0;

            for(int i = 0;i<nums.length;i++){
                

                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i], 1);
                }
                int val = map.get(nums[i]);

                if( val > Math.floor(nums.length/2) && val > max){
                    max = nums[i];
                }

                
            }

            System.out.println(max);
    }
}
