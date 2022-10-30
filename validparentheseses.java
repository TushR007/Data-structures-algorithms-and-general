import java.util.*;
public class validparentheseses {
    public static void main(String[] args) {
        String s = "()[]{}";
        String s1 = "()[]}";

        System.out.println(validornot(s));
        System.out.println(validornot(s1));

    }

    public static boolean validornot(String s) {
        Stack<Character> st = new Stack<Character>();
        char ch;

        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);

            if(ch == '{' || ch == '[' || ch == '(' ){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                if(ch == '}' && st.peek() == '{'){ st.pop(); }
                else if(ch == ']' && st.peek() == '['){ st.pop(); }
                else if(ch == ')' && st.peek() == '('){ st.pop(); }
                else{ return false; }

            }
        }

        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}
