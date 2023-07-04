package Java_collections_framework;
import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Stack" + st);

        st.pop();

        System.out.println(st.peek());

        System.out.println("Stack" + st);

        Stack<String> sts = new Stack<>();

        sts.push("A");
        sts.push("B");
        sts.push("C");
        sts.push("D");

        System.out.println("Stack" + sts);

        sts.pop();

        System.out.println(sts.peek());

        System.out.println("Stack" + sts);


    }
}
