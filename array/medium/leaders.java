import java.util.Arrays;

public class leaders {
  public static void main(String[] args) {
    int[] arr = {10,22,12,3,0,6};

    int n = arr.length;
    int[] ans = new int[n];

    int max = Integer.MIN_VALUE;
    int j = 0;

    for(int i = n-1; i>=0; i--){
      if(arr[i]>max){
        ans[j] = arr[i];
        max = arr[i];
        j++;
      }
    }
    System.out.println(Arrays.toString(ans));
  }
}
