public class KadanesAlgo {
  public int maxSubArray(int[] arr) {
    System.out.print("KadanesAlgo: ");
    if(arr == null || arr.length == 0) return 0;

    int currentsum = arr[0];
    int overallbest = currentsum;
    int n = arr.length;

    for(int i = 0; i < n; i++) {
        currentsum += arr[i];

        if(currentsum < arr[i]) {
          currentsum = arr[i];
        }

        overallbest = Math.max(overallbest, currentsum);
    }

    return overallbest;

  }
}