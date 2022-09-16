import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyofeachelement {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,1,2,3,3,3,4,4,5};

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
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

    }
}