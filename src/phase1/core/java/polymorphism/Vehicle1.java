package phase1.core.java.polymorphism;

class VehicleParent {
	
	int speed = 100;
	int distance = 100000;
	
	public VehicleParent() {

	}
	
	public VehicleParent(int speed, int distance) {
		this.speed = speed;
		this.distance = distance;
	}
	
	public void run() {
		System.out.println("I am running");
	}
	
	public void stop() {
		System.out.println("I stopped");
	}
	
	public void fuel (int a) {
		
	}
	
	public void fuel (float f, String s) {
		
	}
	
	public void fuel (char c, int i) {
	
	}
	
	public void display() {
		System.out.println("parent speed " + speed);
		System.out.println("parent distance " + distance);
	}
	

}

class TwoW extends VehicleParent {
	int speed = 20;
	int distance = 220000;
	int nos_of_type = 2;
	
	public TwoW() {
		
	}
	
	public TwoW(int speed, int distance, int nos_of_type) {
		this.speed = speed;
		this.distance = distance;
		this.nos_of_type = nos_of_type;
	}
	
	
	public void run() {
		System.out.println("2W is running");
	}
	
	public void stop() {
		System.out.println("2W stopped");
	}
	
	public void display() {
		super.display();;
		System.out.println("2W speed " + speed);
		System.out.println("2W distance " + distance);
		System.out.println("2W nos_of_speed " + nos_of_type);
		
	}
	
}

class ThreeW extends VehicleParent {
	int speed = 30;
	int distance = 330000;
	int nos_of_type = 3;
	
	public ThreeW() {
		
	}
	
	public ThreeW(int speed, int distance, int nos_of_type) {
		this.speed = speed;
		this.distance = distance;
		this.nos_of_type = nos_of_type;
	}
	
	public void run() {
		System.out.println("3W is running");
	}
	
	public void stop() {
		System.out.println("3W stopped");
	}
	public void display() {
		super.display();;
		System.out.println("3W speed " + speed);
		System.out.println("3W distance " + distance);
		System.out.println("3W nos_of_speed " + nos_of_type);
		
	}
	
}

class FourW extends VehicleParent {
	int speed = 40;
	int distance = 440000;
	int nos_of_type = 4;
	
	public FourW() {
		
	}
	
	public FourW(int speed, int distance, int nos_of_type) {
		this.speed = speed;
		this.distance = distance;
		this.nos_of_type = nos_of_type;
	}
	
	public void run() {
		System.out.println("4W is running");
	}
	
	public void stop() {
		System.out.println("4W stopped");
	}
	public void display() {
		super.display();;
		System.out.println("4W speed " + speed);
		System.out.println("4W distance " + distance);
		System.out.println("4W nos_of_speed " + nos_of_type);
		
	}
	
}

class EightW extends VehicleParent {
	int speed = 80;
	int distance = 880000;
	int nos_of_type = 8;
	
	public EightW() {
		
	}
	
	public EightW(int speed, int distance, int nos_of_type) {
		this.speed = speed;
		this.distance = distance;
		this.nos_of_type = nos_of_type;
	}
	
	public void run() {
		System.out.println("8W is running");
	}
	
	public void stop() {
		System.out.println("8W stopped");
	}
	public void display() {
		super.display();;
		System.out.println("8W speed " + speed);
		System.out.println("8W distance " + distance);
		System.out.println("8W nos_of_speed " + nos_of_type);
		
	}
	
}


public class Vehicle1 {
	public static void main(String args[]) {

		VehicleParent obj;
		
		obj = new TwoW();
		obj.run();
		obj.stop();
		obj.display();
		System.out.println();
		
		obj = new ThreeW();
		obj.run();
		obj.stop();
		obj.display();
		System.out.println();
		
		obj = new FourW();
		obj.run();
		obj.stop();
		obj.display();
		System.out.println();
		
		obj = new EightW();
		obj.run();
		obj.stop();
		obj.display();
		
		
	}
}


