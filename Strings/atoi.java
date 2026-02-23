public class atoi {
  public static void main(String[] args) {
    String s = "-1337c0d3";
    s = s.trim();

    String str = "";
    int flag = 1;
    int i = 0;
    while(i<s.length() && Character.isDigit(s.charAt(i))){
      char c = s.charAt(i);
      if(s.charAt(0) == '-'){
        flag = -1;
      }
      if (str == "" && c == 0){
        continue;
      }
      if(c == '-' && flag == 0){
        continue;
      }
      if(Long.parseLong(str) > Integer.MAX_VALUE){
        if (flag == 1){
          System.out.println(Integer.MAX_VALUE);
         } else {
          System.out.println(Integer.MIN_VALUE);
         }
      }
      str+=c;
      i++;
    }
    System.out.println(flag*Integer.parseInt(str));
  }
}
