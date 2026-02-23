public class majorityelement {
  public static void main(String[] args){
    int nums[] = {2,2,1,1,1,2,2};
    int count = 0;
    int majorityElement = nums[0];

    for(int i = 0; i<nums.length; i++){
      if(count==0){
        majorityElement = nums[i];
      }
      if(majorityElement==nums[i]){
        count++;
      }
      else{
        count--;
      }
    }
    System.out.println(majorityElement);
  }
}
