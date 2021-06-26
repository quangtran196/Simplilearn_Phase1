package phase1.core.java.datastructure;

public class BinarySearch {
public static void main(String args[]) {
		
		int[] arr = new int[10];
		
		arr[0] = 2;
		arr[1] = 5;
		arr[2] = 8;
		arr[3] = 12;
		arr[4] = 16;
		arr[5] = 20;
		arr[6] = 23;
		arr[7] = 59;
		arr[8] = 90;
		arr[9] = 120;
		
		int mid = arr.length/2;
		int head = 0;
		int last = arr.length;
		int i = arr[mid];
		while (i != 23) {
			if (i > 23) {
				head = mid+1;
				mid = (last - head)/2;
			}
			if (i < 23) {
				last = mid -1;
				mid = (last - head)/2;
			}
			
			if ( i == 23)
				System.out.println(mid);
		}
		System.out.println(mid);
		
		

	}
}
