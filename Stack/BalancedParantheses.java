import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParantheses {
  public static void main(String[] args) {
    String s = "()[]{}";
    Stack<Character> stack = new Stack<>();

    Map<Character, Character> mapping = new HashMap<>();

    mapping.put(')', '(');
    mapping.put(']', '[');
    mapping.put('}', '{');

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (mapping.containsValue(c)){
        stack.push(c);
      } else if (mapping.containsKey(c)) {
        if (stack.isEmpty() || mapping.get(c) != stack.pop()){
          System.out.println(false);
          return;
        }
      }
    }
    System.out.println(stack.isEmpty());
  }
}
