public class rotateString {
  public static void main(String[] args) {
    String s = "abcde", goal = "cdeab";
    String newS = s+s;

    int n = goal.length();

    if (n != s.length()) System.out.println(false);

    for (int i = 0; i<n; i++){
      if (newS.substring(i, i+n).equals(goal)){
        System.out.println(true);
        return; 
      }
    }
    System.out.println(false);
  }
}
