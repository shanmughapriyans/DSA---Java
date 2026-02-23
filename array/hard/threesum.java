import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
  public static void main(String[] args) {
    int[] nums = {-100,-70,-60,110,120,130,160};
    Arrays.sort(nums);
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();

    for(int i = 0; i<n; i++){
      if(i>0 && nums[i] == nums[i - 1]){
        continue;
      }
      int j = i + 1;
      int k = n - 1;
      while(j<k){
        int sum = nums[i] + nums[j] + nums[k];
        if(sum < 0){
          j++;
        }
        else if(sum > 0){
          k--;
        }
        else{
          ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
          j++;
          k--;
          while(j < k && nums[j] == nums[j - 1]) j++;
          while(k > j && nums[k] == nums[k + 1]) k--;
        }
      }
    }
  System.out.println(ans);
  }
}
