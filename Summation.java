import java.util.ArrayList;
import java.util.List;

public class Summation {
	
	public static List<Integer> summation(int[] arr) {
    System.out.print("Summation: ");
		if(arr == null || arr.length == 0) return new ArrayList<>();
		
		List<Integer> res = new ArrayList<>();
		
		int i = 0;
		int n = arr.length;
		int counter = 0;
		int stop = 1;
		
		while(i < n) {
			int sum = 0;
			
			while(i < n && counter < stop) {
				sum += arr[i];
				i++;
				counter++;
			}
			
			counter = 0;
			stop++;
			res.add(sum);
			
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		System.out.println(summation(new int[] {1,6,8,5,9,4,7,2}));
	}

}
