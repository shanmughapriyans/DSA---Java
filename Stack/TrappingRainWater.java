// Problem: Leetcode 42 - Trapping Rainwater
// Approach: Two-Pointer Technique
// Time: O(n)
// Space: O(1)

public class TrappingRainWater {
  public static void main(String[] args) {
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

    int left = 0;
    int right = height.length - 1;
    int leftMax = height[left];
    int rightMax = height[right];
    int total = 0;

    while(left < right){
      if(height[left] <= height[right]){
        left++;
        leftMax = Math.max(leftMax, height[left]);
        if(leftMax > 0 && height[left] <= leftMax){
          total += leftMax - height[left];
        }
      }
      else{
        right--;
        rightMax = Math.max(rightMax, height[right]);
        if(rightMax > 0 && height[right] < rightMax){
          total += rightMax - height[right];
        }
      }
    }
    System.out.println(total);
  }
}
