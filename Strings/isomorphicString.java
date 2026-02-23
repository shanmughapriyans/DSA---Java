import java.util.HashMap;

public class isomorphicString {
  public static void main(String[] args) {
    String s = "paper", t = "title";
    HashMap<Character, Character> hm1 = new HashMap<>();
    HashMap<Character, Character> hm2 = new HashMap<>();

    for (int i = 0; i<t.length(); i++){
      char a = s.charAt(i);
      char b = t.charAt(i);

      hm1.put(a,b);
      hm2.put(b,a);

      if(hm1.getOrDefault(a, b) != b || hm2.getOrDefault(b, a) != a){
        System.out.println(false);
      }
    }
    System.out.println(true);

  }
}
