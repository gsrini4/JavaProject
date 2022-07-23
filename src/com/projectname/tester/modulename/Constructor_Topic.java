package com.projectname.tester.modulename;

public class Constructor_Topic {

	//Default constructor
	public Constructor_Topic() {
		System.out.println("Constructor");
	}
	
	//Parameterised constructor
	public Constructor_Topic(String parameter) {
		System.out.println("Constructor = "+ parameter);
	}
	
	public static void main(String[] args) {
		
		//Classname objname = new Classname();
		Constructor_Topic ct = new Constructor_Topic();
		Constructor_Topic ct1 = new Constructor_Topic("Parameterised constructor");
		
	}
}
