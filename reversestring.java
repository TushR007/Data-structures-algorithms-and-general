import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println(reverse("hello how do you do"));
    System.out.println(reverserecursion("hello how do you do"));
  }

  public static String reverse(String s){
    int l = s.length();
    String r = "";
    for(int i=l-1; i>=0; i--){
      r += s.charAt(i);
    }
    return r;
  }

  public static String reverserecursion(String str){
    if(str.length() == 0){
      return "";
    }
    return reverserecursion(str.substring(1)) + str.charAt(0);
  }
}