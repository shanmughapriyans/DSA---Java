public class longestPalindrome {
  public static void main(String[] args) {
    String s = "babad";

    StringBuilder str = new StringBuilder();
    str.append(s.charAt(0));
    int i = 0,j = 1;
    int length = 0;
    int maxLength = 0;
    int[] maxLengthIndex = {0,1};
    int n = s.length();

    while(i<n || j<n){
      if (s.substring(i,j) == str.toString()){
        length++;
        if(length > maxLength){
          maxLength = length;
          maxLengthIndex[0] = i;
          maxLengthIndex[1] = j;
        }
      }
      if(i < n && s.substring(i,j) != str.toString()){
        
        i++; 
      }
      str.insert(0,s.charAt(j));


      if(j < n) j++;
    }
  }
}
