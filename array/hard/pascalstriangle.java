import java.util.ArrayList;
import java.util.List;

public class pascalstriangle {
  public static void main(String[] args) {
    List<List<Integer>> triangle = new ArrayList<>();

    for(int j = 1; j<6; j++){
      List<Integer> row = new ArrayList<>();
      int ans = 1;
      row.add(ans);
      for(int i = 1; i<j; i++){
        ans = ans * (j - i);
        ans /= i;
        row.add(ans);
      }
      triangle.add(row);
    }
    System.out.println(triangle);

  }

  static long ncr(int n, int r){
    long result = 1;

    for(int i = 0; i<r; i++){
      result = result * (n - i);
      result = result / (i + 1);
    }

    return result;
  }
}
