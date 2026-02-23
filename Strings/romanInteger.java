import java.util.HashMap;

public class romanInteger {
  public static void main(String[] args) {
    String s = "III";

    HashMap<Character, Integer> hm = new HashMap<>();

    hm.put('I',1);
    hm.put('V',5);
    hm.put('X',10);
    hm.put('L',50);
    hm.put('C',100);
    hm.put('D',500);
    hm.put('M',1000);

    int ans = hm.get(s.charAt(s.length()-1));

    for(int i = s.length()-2; i>=0;i--){
      int current = hm.get(s.charAt(i));
      int before = hm.get(s.charAt(i+1));
      if(current < before){
        ans-=current;
      } else {
        ans+=current;
      }
    }
    System.out.println(ans);
  }
}
