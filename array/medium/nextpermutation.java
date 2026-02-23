import java.util.Arrays;

public class nextpermutation {
  public static void main(String[] args) {
    int[] nums = {2,1,5,4,3,0,0};

    int ind = -1;

    int n = nums.length;

    for(int i = n-2; i>=0; i--){
      if(nums[i]<nums[i+1]){
        ind = i;
        System.out.println(nums[ind]);
        break;
      }
    }

    if( ind == -1 ){
      int start = 0;
      int end = nums.length - 1;

      while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        start++;
        end--;
      }
      System.out.println(nums);
    }  

    for(int i = n-1; i>=0; i--){
      System.out.println(nums[i]);
      if(nums[i]>nums[ind]){
        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
        break;
      }
    }
    System.out.println(Arrays.toString(nums));
    int start = ind +1;
    int end = nums.length - 1;

    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;

      start++;
      end--;
    }
    System.out.println(Arrays.toString(nums));
  }
}
