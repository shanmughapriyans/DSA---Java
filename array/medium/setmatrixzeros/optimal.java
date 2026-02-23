package setmatrixzeros;

import java.util.Arrays;

public class optimal {
  public static void main(String[] args) {
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

    int m = matrix.length;
    int n = matrix[0].length;

    int row0 = 1;

    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        if(matrix[i][j] == 0){
          matrix[i][0] = 0; 
          if(j != 0){ 
            matrix[0][j] = 0; 
          }
          else{
            row0 = 0; 
          }
        }
      }
    }

    for(int i = 1; i<m; i++){
      for(int j = 1; j<n; j++){
        if(matrix[i][j] != 0){
          if(matrix[0][j] == 0 || matrix[i][0] == 0){
            matrix[i][j] = 0;
          }
        }
      }
    }

    if(matrix[0][0] == 0){
      for(int j = 0; j<n; j++){
        matrix[0][j] = 0;
      }
    }
    if(row0 == 0){
      for(int i = 0; i<m; i++){
        matrix[i][0] = 0;
      }
    }

    System.out.println(Arrays.deepToString(matrix));
  }
}
