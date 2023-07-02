package Java_collections_framework;
import java.util.*;

public class Arraylists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        System.out.println(list.get(2)); 

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        list.addAll(list1);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove(Integer.valueOf(4));
        System.out.println(list);

        list.set(3,1000);
        System.out.println(list);

        System.out.println(list.contains(5));

        //Multiple ways to traverse

        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        
        for(int e: list){
            System.out.println(e);
        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            
            System.out.println(it.next());
        }

        list.clear();
        System.out.println(list);

    }
}
