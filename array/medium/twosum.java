import java.util.HashMap;

public class twosum {
  public static void main(String []args){
    int arr[] = {1,2,3,4,5,6,7};
    int target = 12;

    HashMap<Integer, Integer> hash = new HashMap<>();
    int n = arr.length;

    for(int i = 0; i<n; i++){
      int complement = target - arr[i];

      if(hash.containsKey(complement)){
        System.out.println(hash.get(complement)+" "+i);
      }
      hash.put(arr[i], i);
    }

  }
}
