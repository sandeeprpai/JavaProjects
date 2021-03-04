public class RotateArrayInplace {

  private static void reverseHelper(int[] arr, int s, int e) {
    if(s == e) return;
    int i = s;
    int j = e;
    while(i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public static int[] rotateArray(int[] arr, int k) {
    System.out.print("RotateArrayInplace: ");

    if(arr == null || arr.length == 0) return arr;
    int n = arr.length;
    if(k > n) k = k % n;
    //reverse completely
    reverseHelper(arr, 0, n - 1);

    //reverse k elements
    reverseHelper(arr, 0, k - 1);

    //reverse k+1 to end
    reverseHelper(arr, k, n - 1);
    
    return arr;
  }

  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int[] arr = rotateArray(a, 2);
    for(int i : arr) {
      System.out.print(i + " ");      
    }    
  }
}