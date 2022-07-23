package com.projectname.tester.modulename;

public class Keywords extends FinalTypes { // main class or outer class

	int a = 1000;
	
	public void add() {
		int a = 100;
		System.out.println("Local Variable = "+a);
		System.out.println("This keyword = "+ this.a);
		System.out.println("Super keyword = "+ super.a);
	}
	
	public static void main(String[] args) {
		
		Keywords k = new Keywords();
		k.add();
	}

}
