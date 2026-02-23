public class longestsubarrywithsumk {
  public static void main(String[] args) {
    int i = 0, j = 1, count=1, k = 2;

    int[] nums = {1,1,1};
    int sum = nums[0];

    int n = nums.length;

    while(j<n){
      sum+= nums[j];
      int tempCount = 1;

      if(sum>k){
        i++;

        tempCount = 1;
        sum = nums[i];
        continue;
      }

      else if(sum == k){
        count = Math.max(count, tempCount);
      }
      j++;
      tempCount++;
    }
    System.out.println(count);
  }
} 
