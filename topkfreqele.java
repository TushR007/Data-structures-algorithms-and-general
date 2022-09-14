import java.util.*;


public class topkfreqele {
    public static void main() {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            if(!map.contains(arr[i])){
                int c = 0;
                map.add(arr[i],1);
            }
            else{
                map.get(arr[i]++);
            }
        }

        for(int i = 0;i<k;i++){
            System.out.println(map.get(i));
        }
    }
}
