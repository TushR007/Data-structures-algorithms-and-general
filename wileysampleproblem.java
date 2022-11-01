import java.util.*;
public class wileysampleproblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mina = 0,minb = 0,minc = 0;

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            String d = scn.next();
            int t = scn.nextInt();

            if(map.containsKey("A")){
                int val = map.get("A");

                if(mina == 0){
                    mina = val;
                }

                if(val < mina){
                    mina = val;
                }
            }

            if(map.containsKey("B")){
                int val = map.get("B");

                if(minb == 0){
                    minb = val;
                }

                if(val < minb){
                    minb = val;
                }
            }

            if(map.containsKey("C")){
                int val = map.get("C");

                if(minc == 0){
                    minc = val;
                }

                if(val < minc){
                    minc = val;
                }
            }

            map.put(d,t);

        }

        if((mina+minb) < minc){
            System.out.println(mina+minb);
        } else {
            System.out.println(minc);
        }


    }
}
