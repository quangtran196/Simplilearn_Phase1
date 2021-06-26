package phase1.core.java.polymorphism;

abstract class MNC {
	MNC(){
		System.out.println("MNC is created");
	}
	
	abstract void method1();
	abstract void method2();
	
	void MNCdisplay() {
		System.out.println("Hello I am MNC");
	}
}

abstract class Infosys extends MNC{
	abstract void method3();
	
	void InfoDisplay() {
		System.out.println("Hello I am Infosys");
	}
}

class hello extends Infosys {

	@Override
	void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method3 is running");
		
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1 is running");
		
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2 is running");
		
	}
	
	void helloDisplay() {
		System.out.println("Hi, my name is Hello");
	}
}


public class AbstractExample1 {
	public static void main(String args[]) {

	Infosys obj = new hello();
	
	obj.MNCdisplay();
	obj.method1();
	obj.method2();

	obj.InfoDisplay();
	obj.method3();
	

	}
}
