import java.util.HashMap;

public class countsubarraysum {
  public static void main(String[] args) {
    HashMap<Integer, Integer> hash = new HashMap<>();

    int nums[] = {1,2,3,-3,1,1,1,4,2,-3};
    int k = 3;
    int n = nums.length;

    int preSum = 0;
    int count = 0;
    hash.put(0,1);

    for(int i = 0; i<n; i++){
      preSum += nums[i];

      int remove = preSum - k;

      if(hash.containsKey(remove)){
        count += hash.get(remove);
      }
      hash.put(preSum, hash.getOrDefault(preSum, 0)+1);
    }
    System.out.println(count);
  }
}
