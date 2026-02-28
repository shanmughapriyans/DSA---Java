// Problem: Leetcode - 402 (Remove K Digits)
// Approach: Use a monotonic increasing stack (greedy strategy) to remove larger digits 
//           when a smaller digit appears, remove remaining k digits if needed, then 
//           build the result and trim leading zeros.
// Time: O(n)
// Space: O(n)

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKdigits {
  public static void main(String[] args) {
    String num = "10000";
    Deque<Character> digitHandler = new ArrayDeque<>();
    StringBuilder result = new StringBuilder();
    int k = 1;
    if(num.length() == k){
      System.out.println("0");
      return;
    }
    for(int i = 0; i < num.length(); i++){
      char currentNum = num.charAt(i);
      while(!digitHandler.isEmpty() && digitHandler.peek() > currentNum && k > 0){
        digitHandler.pop();
        k--;
      } 
      digitHandler.push(currentNum);
    }
    while(k > 0){
      digitHandler.pop();
      k--;
    }
    int n = digitHandler.size();
    for(int i = 0; i<n; i++){
      result.append(digitHandler.pop());
    }
    result.reverse();
    while(result.length() > 1 && result.charAt(0) == '0'){
      result.deleteCharAt(0);
    }
    String finalResult = result.toString();
    System.out.println(finalResult);

  }
}
