public class singlenumber {
  public static void main(String[] args) {
    int nums[] = {4,1,2,1,2};
    int n = nums.length;

    int xor=0;
    for(int i=0;i<n;i++){
      xor=xor^nums[i];
    }
    System.out.println(xor);

  }
}
