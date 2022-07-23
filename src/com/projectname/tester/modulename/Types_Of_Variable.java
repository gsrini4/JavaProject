package com.projectname.tester.modulename;

//Local variable
public class Types_Of_Variable {
	
	static int b;
	int c = 2000;
	
	public static void add() {
		int a = 100;
		System.out.println("Local variable = "+ a);
	}

	public static void main(String[] args) {
		
		Types_Of_Variable tov = new Types_Of_Variable();
		add();
		System.out.println("Class variable = "+tov.c);
		System.out.println("Static Variable = "+b);
	}
}
