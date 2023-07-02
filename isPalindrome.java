 import java.util.*;

 public class isPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        String str1 = "";
        String str2 = "";

        char ch;

        System.out.println(str);

        for(int i = str.length()-1; i>=0 ;i--){
            ch = str.charAt(i);
            if(ch >= 65 && ch <= 122){
                str1 += ch;
            }
        }

        System.out.println(str1);

        for(int i = 0; i<str.length() ;i++){
            ch = str.charAt(i);
            if(ch >= 65 && ch <= 122){
                str2 += ch;
            }
        }

        System.out.println(str2);

        if(str1.equals(str2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
