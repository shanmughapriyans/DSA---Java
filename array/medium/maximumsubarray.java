public class maximumsubarray {
  public static void main(String[] args) {
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    int n = arr.length;

    int maximum = arr[0];

    int sum = arr[0];

    for(int i = 0; i<n; i++){
      sum = Math.max(arr[i],sum+arr[i]);
      maximum = Math.max(maximum,sum);
    }
    System.out.println(maximum);
  }
}
