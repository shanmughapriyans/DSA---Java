import java.util.Arrays;

public class reverseWords {
  public static void main(String[] args) {
    String s = "the sky   is blue";
    StringBuilder ans = new StringBuilder();

    String[] arr = s.split(" ");
    System.out.println(Arrays.toString(arr));
    int n = arr.length;
    System.out.println(ans);
    for(int i = n-1; i >= 0; i--){
      if(arr[i].isEmpty()) continue;
      ans.append(arr[i]+" ");
    }
    ans.append(arr[0]);
    System.out.println(ans);
  }
}
