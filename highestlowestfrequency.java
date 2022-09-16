import java.util.*;

public class highestlowestfrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = 0, s=1;
        int[] arr = {1,1,2,2,3,3,3,4,4,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{ 
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (l < entry.getValue()){
                l = entry.getKey();
            }

            if(s >= entry.getValue()){
                s = entry.getKey();
            }
        }

        System.out.println(l + " "+s);
    }
}
