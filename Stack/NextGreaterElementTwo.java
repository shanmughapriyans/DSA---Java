// Problem: Leetcode 503 - NGE 2
// Approach: Decreasing Monotonic Stack from 2n-1 to 0
// Time: O(n)
// Space: O(n)

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementTwo {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    
    int[] nums = {1,2,3,4,3};
    int[] result = new int[nums.length];
    
    for (int i = 2*nums.length - 1; i >= 0; i--) {
      int index = i%nums.length;
      int element = nums[index];
      while(!st.isEmpty() && element >= st.peek()){
        st.pop();
      }
      result[index] = st.isEmpty() ? -1 : st.peek();
      st.push(element);      
    }
    System.out.println(Arrays.toString(result));
  }
}
