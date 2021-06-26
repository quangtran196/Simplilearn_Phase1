package phase1.core.java.methods;

import java.util.*;

public class ConstructorExample {
	int id;
	String name;
	
	public ConstructorExample() {
		id = 10;
		name = "hello";
		System.out.println("I am inside the deafult constructor");
	}
	
	void display() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		//ConstructorExample s2 = new ConstructorExample();
		//s2.display();
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		list.add("September");
		list.add("October");
		
		System.out.println();
		System.out.println(list.size());
		Iterator iter1 = list.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		list.add(4, "May");
		list.add(5, "June");
		list.add(6, "July");
		list.add(7, "August");
		
		System.out.println();
		System.out.println(list.size());
		Iterator iter2 = list.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		list.addLast("November");
		list.addLast("December");
		System.out.println();
		Iterator iter3 = list.iterator();
		while(iter3.hasNext()) {
			System.out.println(iter3.next());
		}
		
	}
	
}
