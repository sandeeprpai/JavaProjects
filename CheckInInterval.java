public class CheckInInterval {
	
	public boolean checkInterval(int[][] arr, int input) {
    System.out.print("CheckInInterval: ");
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		int start = 0, end = arr.length;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			if(arr[mid][0] <= input && arr[mid][1] >= input) {
				return true;
			} else if(arr[mid][0] > input) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return false;
	}

}