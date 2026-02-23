import java.util.ArrayList;
import java.util.List;

public class majorityelement {
  public static void main(String[] args) {
    int[] nums = {1,1,1,2,2,2,3,3,3};
    int n = nums.length;

    int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
    int count1 = 0, count2 = 0;

    for(int i = 0; i<n; i++){
      if(count1 == 0 && nums[i] != element2){
        count1 = 1;
        element1 = nums[i];
      }
      else if(count2 == 0 && nums[i] != element1){
        count2 = 1;
        element2 = nums[i];
      }
      else if(element1 == nums[i]) count1++;
      else if(element2 == nums[i]) count2++;
      else{
        count1--;
        count2--; 
      }
    }
    List<Integer> melement = new ArrayList<>();
    count1 = 0;
    count2 = 0;
    for(int i = 0; i<n; i++){
      if(element1 == nums[i]) count1++;
      else if(element2 == nums[i]) count2++;
    }
    if (count1 > n/3) {
      melement.add(element1);
    }
    if (count2 > n/3) melement.add(element2);

  }
}
