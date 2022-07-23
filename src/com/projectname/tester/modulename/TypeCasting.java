package com.projectname.tester.modulename;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening => small to big
		
		byte c = 10;
		short d = c;
		System.out.println("Widening = "+ d);
		
		// narrowing => big to small
		int a = 10;
		byte b = (byte)a;
		System.out.println("Narrowing = "+ b);
		
	}
}
