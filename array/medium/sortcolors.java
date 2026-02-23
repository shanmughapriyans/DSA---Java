import java.util.Arrays;

public class sortcolors {
  public static void main(String[] args) {
    int nums[] = {2,0,2,1,1,0};
    int n = nums.length;
    int low = 0;
    int high = n-1;
    int mid = 0;

    while(mid<=high){
      if(nums[mid]==0){
        nums[mid]=nums[low];
        nums[low]=0;
        low++;
        mid++;
      } else if(nums[mid]==1) {
        mid++;
      } else {
        nums[mid]=nums[high];
        nums[high]=2;
        high--;
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}
