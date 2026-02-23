import java.util.Arrays;

public class removeduplicates {
  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 3, 3, 4, 5, 5};
    int n = nums.length;

    int temp = nums[0];
    int index = 1;
    for(int i = 1; i < n; i++) {
      if(nums[i] != temp) {
        temp = nums[i];
        nums[index] = nums[i];
        index++;
      }
    }
    System.out.println(Arrays.toString(nums));
    System.out.print(index);
  }
}