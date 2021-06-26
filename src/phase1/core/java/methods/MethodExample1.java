package phase1.core.java.methods;

public class MethodExample1 {
	
	public static void main (String[] args) {
		int a = 11;
		int b = 6;
		int c = minFuction(a, b);
		System.out.println("Minimum value "+ c);
		
		// In-class exercise
		MethodExample1 d = new MethodExample1();
		float r = d.areaOfCircle(6.234f);
		int t = d.areaOfTrianle(5,  7);
		System.out.println("\n In-class exercise");
		System.out.println("total value "+ total(4,6));
		System.out.println("Area pf a Circle "+ r);
		System.out.println("Area of a Triangle "+ t);
	}
	
	public static int minFuction( int a, int b) {
		
		if (a > b) return b;
		else return a;
	}
	
	static int total (int a, int b) {
		//return total of 2 number
		return a+b;
	}
	
	public float areaOfCircle(float r) {
		//return area of a circle
		return (float) (3.14) * r * r;
	}
	
	public int areaOfTrianle (int height, int base) {
		//return area of a triangle
		return (height*base)/2;
	}
}
