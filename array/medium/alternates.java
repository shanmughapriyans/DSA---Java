import java.util.Arrays;

public class alternates {
  public static void main(String[] args) {
    int nums[] = {3,1,-2,-5,2,-4};
    int n = nums.length;

    int posIndex = 0, negIndex = 1;

    int[] alternates = new int[n];

    for(int i = 0; i<n; i++){
      if(nums[i]<0){
        alternates[negIndex] = nums[i];
        negIndex+=2;
      } else {
        alternates[posIndex] = nums[i];
        posIndex+=2;
      }
    }
    System.out.println(Arrays.toString(alternates));
  }
}
