public class removeOuterParentheses {
  public static void main(String[] args) {
    String s = "(()())(())";
    int n = s.length();

    StringBuilder newString = new StringBuilder();

    int open = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '(') {
        open++;
        if(open>1){
          newString.append('(');
        }
      } 
      else if (s.charAt(i) == ')'){
        if (open > 1){
          newString.append(")");
          open--;
        }
        else {open--;}
      }
    }
    System.out.println(newString);
  }
}
