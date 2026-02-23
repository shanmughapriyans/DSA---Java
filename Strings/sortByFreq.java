import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sortByFreq {
  public static void main(String[] args){
    String s = "tree";
    HashMap<Character, Integer> hm = new HashMap<>();
    //HashMap<Integer, Character> hm2 = new HashMap<>();

    StringBuilder result = new StringBuilder();

    for (char ch : s.toCharArray()){
      hm.put(ch, hm.getOrDefault(ch, 0)+1);
    }

    List<Character>[] bucket = new List[s.length() + 1];
    for (char c : hm.keySet()){
      int f = hm.get(c);
      if (bucket[f] == null){
        bucket[f] = new ArrayList<>();
      }
      bucket[f].add(c);
    }

    for (int i = bucket.length-1; i>=0; i--){
      if(bucket[i] != null){
        for(char c : bucket[i]){
          for(int j = 0;j<i;j++){
            result.append(c);
          }
        }
      }
    }
    System.out.println(result);
  }
}
