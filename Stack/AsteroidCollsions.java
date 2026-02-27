// Problem: Leetcode - 735 (Asteroid Collision)
// Approach: Use a stack to simulate collisions. 
//           For each asteroid, resolve collisions while the top of the stack 
//           is moving right and the current asteroid is moving left.
//           Compare magnitudes to decide which asteroid survives.
// Time: O(n)
// Space: O(n)

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollsions {
 public static void main(String[] args) {
  int[] asteroids = {5,10,-5};

  Stack<Integer> asteroidCollider = new Stack<>();
  asteroidCollider.push(asteroids[0]);

  for (int i = 1; i < asteroids.length; i++) {
    boolean isAlive = true;
    while(isAlive && !asteroidCollider.isEmpty() && asteroidCollider.peek() > 0 && asteroids[i] < 0){
      int top = asteroidCollider.peek();
      if(Math.abs(top) > Math.abs(asteroids[i])){
        isAlive = false;
      } else if(Math.abs(top) == Math.abs(asteroids[i])){
        asteroidCollider.pop();
        isAlive = false;
      } else {
        asteroidCollider.pop();
      }
    }
    if(isAlive) asteroidCollider.push(asteroids[i]);

  }
  int[] result = new int[asteroidCollider.size()];

  for (int i = 0; i < asteroidCollider.size(); i++) {
      result[i] = asteroidCollider.get(i);
  }
  System.out.println(Arrays.toString(result));
 } 
}
