public class nestingDepth {
  public static void main(String[] args) {
    String s = "(1+(2*3)+((8)/4))+1";
    int count = 0;
    int maxDepth = 0;
    
    for (int i = 0; i< s.length(); i++){
      if(s.charAt(i) == '('){
        count++;
        if(count > maxDepth) maxDepth = count;
      } 
      if(s.charAt(i) == ')'){
        if(count != 0) count--;
      };
    }
    System.out.println(maxDepth);
  }
}
