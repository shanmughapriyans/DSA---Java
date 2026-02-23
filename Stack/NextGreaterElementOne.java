// Problem: Leetcode 496 - NGE 1
// Approach: Decreasing Monotonic Stack
// Time: O(2N) -> O(n + m)
// Space: O(n)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementOne {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Map<Integer, Integer> hash = new HashMap<>();

    int[] nums1 = {4,1,2};
    int[] nums2 = {1,3,4,2};

    for (int i = nums2.length - 1; i >= 0; i--) {
      int element = nums2[i];
      while(!st.isEmpty() && element > st.peek()){
        st.pop();
      }
      hash.put(element, st.isEmpty() ? -1 : st.peek());
      st.push(element);
    }
    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = hash.get(nums1[i]);
    }
    System.out.println(Arrays.toString(nums1));
  }
}
