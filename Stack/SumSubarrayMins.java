// Problem: Leetcode - 907 
// Approach: Use a monotonic increasing stack to find Previous Smaller Element (PSE) and 
//           Next Smaller Element (NSE), then compute each element’s contribution as 
//           arr[i] × (i - pse[i]) × (nse[i] - i)
// Time: O(n)
// Space: O(n)

import java.util.Stack;

public class SumSubarrayMins {
  public static void main(String[] args) {
    int[] arr = {3,1,2,4};
    int n = arr.length;
    int mod = 1_000_000_007;

    int[] nse = new int[n];
    int[] pse = new int[n];

    Stack<Integer> pseStack = new Stack<>();
    Stack<Integer> nseStack = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      while(!pseStack.isEmpty() && arr[pseStack.peek()] > arr[i]) pseStack.pop();

      pse[i] = pseStack.isEmpty() ? -1 : pseStack.peek();
      pseStack.push(i);
    }
    for (int i = arr.length-1; i >= 0; i--) {
      while(!nseStack.isEmpty() && arr[nseStack.peek()] >= arr[i]) nseStack.pop();
      
      nse[i] = nseStack.isEmpty() ? n : nseStack.peek();
      nseStack.push(i);
    }
    long result = 0;
    for (int i = 0; i < arr.length; i++) {
      long left = i - pse[i];
      long right = nse[i] - i;
      result = (result + arr[i] * left * right) % mod;
    }
    System.out.println(result);
    
  }
}
