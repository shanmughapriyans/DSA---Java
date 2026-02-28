// Problem: Leetcode - 2104 (Sum of Subarray Ranges)
// Approach: Compute total contribution of each element as both minimum and maximum 
//           using a monotonic stack to find previous and next greater/smaller boundaries, 
//           then return (sum of max contributions − sum of min contributions).
// Time: O(n)
// Space: O(n)

import java.util.Stack;

public class SubArrayRanges {
  public static void main(String[] args) {
    int[] nums = {1,2,3};
    long[] result = subCompute(nums);
    long minSum = result[0];
    long maxSum = result[1];
    System.out.println(maxSum-minSum);
  }
  public static long[] subCompute(int[] nums){
    long[] resultArr = new long[2];
    int n = nums.length;
    int[] nse = new int[n];
    int[] pse = new int[n];
    int[] pge = new int[n];
    int[] nge = new int[n];
    
    Stack<Integer> pseStack = new Stack<>();
    Stack<Integer> nseStack = new Stack<>();
    Stack<Integer> pgeStack = new Stack<>();
    Stack<Integer> ngeStack = new Stack<>();
    
    for (int i = 0; i < nums.length; i++) {
      while(!pseStack.isEmpty() && nums[pseStack.peek()] > nums[i]) pseStack.pop();
      
      pse[i] = pseStack.isEmpty() ? -1 : pseStack.peek();
      pseStack.push(i);
      while(!pgeStack.isEmpty() && nums[pgeStack.peek()] < nums[i]) pgeStack.pop();
      
      pge[i] = pgeStack.isEmpty() ? -1 : pgeStack.peek();
      pgeStack.push(i);
    }
    for (int i = nums.length-1; i >= 0; i--) {
      while(!nseStack.isEmpty() && nums[nseStack.peek()] >= nums[i]) nseStack.pop();
      
      nse[i] = nseStack.isEmpty() ? n : nseStack.peek();
      nseStack.push(i);
      while(!ngeStack.isEmpty() && nums[ngeStack.peek()] <= nums[i]) ngeStack.pop();
      
      nge[i] = ngeStack.isEmpty() ? n : ngeStack.peek();
      ngeStack.push(i);
    }
    long result = 0;
    for (int i = 0; i < nums.length; i++) {
      long left = i - pse[i];
      long right = nse[i] - i;
      result = (result + nums[i] * left * right);
    }
    resultArr[0] = result;
    result = 0;
    for (int i = 0; i < nums.length; i++) {
      long left = i - pge[i];
      long right = nge[i] - i;
      result = (result + nums[i] * left * right);
    }
    resultArr[1] = result;
    return resultArr;
  }
}
