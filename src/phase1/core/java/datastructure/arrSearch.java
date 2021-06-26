package phase1.core.java.datastructure;

public class arrSearch {

	public static void main(String args[]) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i+5;
		}
		
		//find index of 12
		for(int i = 0; i < 10; i++) {
			if (arr[i] == 12) 
				System.out.println("Index of 12 is " + i);	
				}
		
	}
}
