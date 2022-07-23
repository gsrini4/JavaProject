package com.projectname.tester.modulename;

public class Class_B extends Class_A{
	
	public Class_B(String name1) {
		super("parameterised constructor_1");
		System.out.println("Class_ B constructor = "+ name1);
	}
	
	public static void main(String[] args) {
		
		Class_A classAB = new Class_B("parameterised constructor_2");
		
	}

}
