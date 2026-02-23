import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
  public static void main(String[] args) {
    int[] nums = {1000000000,1000000000,1000000000,1000000000};

    List<List<Integer>> ans = new ArrayList<>();

    int n = nums.length;
    Arrays.sort(nums);

    int target = -294967296;

    for(int i = 0; i<n; i++){
      if (i > 0 && nums[i] == nums[i - 1]){
        continue;
      }
      for(int j = i+1; j<n-2; j++){
        if (j > i+1 && nums[j] == nums[j - 1]){
          continue;
        }
        int k = j + 1;
        int l = n - 1;
        while(k < l){
          int sum = nums[i] + nums[j] + nums[k] + nums[l];
          if (sum < target){
            k++;
          }
          else if (sum > target){
            l--;
          }
          else {
            ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
            k++;
            l--;
            while (nums[k] == nums[k - 1] && k < l) k++;
            while (nums[l] == nums[l + 1] && k < l) l--;
          }
        }
      }

    }
    System.out.println(ans);
  }
}
