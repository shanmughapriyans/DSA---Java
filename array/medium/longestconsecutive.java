import java.util.HashSet;

public class longestconsecutive {
  public static void main(String[] args) {
    int[] nums = {100,4,200,1,3,2};

    int n = nums.length;

    int longest = 1;

    HashSet<Integer> numbers = new HashSet<Integer>();

    for(int i = 0; i<n; i++){
      numbers.add(nums[i]);
    }

    for(int it: numbers){
      if(!numbers.contains(it-1)){
        int count = 1;
        int x = it;

        while(numbers.contains(x+1)){
          x+=1;
          count+=1;
        }
        longest = Math.max(count, longest);
      }
    }
    System.out.println(longest);

  }
}
