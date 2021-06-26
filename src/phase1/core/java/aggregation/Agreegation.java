package phase1.core.java.aggregation;

class Operation {
	int squared (int a, int b) {
		return a * b;
	}
}

class Rectangle {
	Operation op;
	
	int areaRec (int a, int b) {
		op = new Operation();
		return op.squared(a, b);
	}
}

class Square {
	Operation op;
	
	int areaSquare (int a, int b) {
		op = new Operation();
		return op.squared(a, b); 
	}
}

class AggExample {
	Operation op;
	
	double areaCircle (int radius) {
		op = new Operation();
		return op.squared(radius,radius) * 3.14;

	}
}

public class Agreegation {

	public static void main(String[] args) {
		AggExample Agg = new AggExample();
		double areaAgg = Agg.areaCircle(10);
		System.out.println("area of circle: " + areaAgg);
		
		Square square = new Square();
		int areSqu = square.areaSquare(9, 9);
		System.out.println("area of square: " + areSqu);
		
		Rectangle rectangle = new Rectangle();
		int areRec = rectangle.areaRec(7, 8);
		System.out.println("area of rectangle: " + areRec);

	}

}

