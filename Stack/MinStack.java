// Problem: Leetcode 155 - Min Stack
// Approach: Stack storing pairs
// Time: O(1)
// Space: O(n)

import java.util.Stack;

public class MinStack {
  private Stack<int[]> st;

  public MinStack(){
    st = new Stack<>();
  }

  public void push(int value){
    if(st.isEmpty()){
      st.push(new int[]{value,value});
    }
    else {
      int currentMin = st.peek()[1];
      st.push(new int[]{value,Math.min(currentMin,value)});
    }
  }
  public void pop(){
    st.pop();
  }

  public int top(){
    return st.peek()[0];
  }

  public int getMin(){
    return st.peek()[1];
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.getMin()); 
    minStack.pop();
    System.out.println(minStack.top());
    System.out.println(minStack.getMin());
  }
}
