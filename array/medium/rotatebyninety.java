import java.util.Arrays;

public class rotatebyninety {
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    int m = matrix.length;
    int n = matrix[0].length;

    for(int i = 0; i<m-1; i++){
      for(int j = i+1; j<n; j++){
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
      }
    }

    for(int i = 0; i<m; i++){
      int left = 0;
      int right = m-1;

      while(left < right){
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
      }
    }

    System.out.println(Arrays.deepToString(matrix));
  }
}
