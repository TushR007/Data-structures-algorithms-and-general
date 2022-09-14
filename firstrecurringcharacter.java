import java.util.HashMap;

public class firstrecurringcharacter {

    public static void main(String[] args) {
        System.out.println(rec(new int[]{2,5,1,2,3,5,1,2,4}));
    }

    public static int rec(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;

        for(int val:arr ){
            if(map.containsKey(val)){
                return val;
            }

            map.put(val,i);
            i++;
        }
        return 0;
    }
    
}
