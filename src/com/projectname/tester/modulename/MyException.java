package com.projectname.tester.modulename;

public class MyException extends Exception{
	
	public MyException() {
		System.out.println("NumberFormat Exception");
	}
	
	
	public MyException(String exception) {
		System.out.println("NumberFormat Exception = "+exception);
	}
}
