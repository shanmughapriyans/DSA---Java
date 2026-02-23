import java.util.List;
import java.util.ArrayList;

public class spiralmatrix {
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    
    List<Integer> spiral = new ArrayList<>();

    int m = matrix.length;
    int n = matrix[0].length;

    int left = 0, top = 0, right = n-1, bottom = m-1;

    while(top <= bottom && left <= right){
      for(int i = left; i<=right; i++){
        spiral.add(matrix[top][i]);
      }
      top++;
      for(int i = top; i<=bottom; i++){
        spiral.add(matrix[i][right]);
      }
      right--;
      if(top <= bottom){
        for(int i = right; i>=left; i--){
          spiral.add(matrix[bottom][i]);
        }
      }
      bottom--;
      
      if(left <= right){
        for(int i = bottom; i>=top; i--){
          spiral.add(matrix[i][left]);
        }
      }
      left++;
    }
    System.out.println(spiral);
  }
}
