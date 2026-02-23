import java.util.Arrays;

public class longestCommonPrefix {
  public static void main(String[] args) {
    String []strs = {"flower","flow","flight"};

    Arrays.sort(strs);
    String firstWord = strs[0];
    String lastWord = strs[strs.length-1];

    int count = 0;

    for(int i = 0; i<firstWord.length(); i++){
      if(firstWord.charAt(i) != lastWord.charAt(i)){
        break;
      }
      count++;
    }
    System.out.println(firstWord.substring(0, count));
  }
}
