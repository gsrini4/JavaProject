package com.projectname.tester.modulename;

public class ExceptionHandling extends MyException{

	
	public static void add() throws MyException{
		
		String s = "1234";
		
		// Convert String to int
		int parseInt = Integer.parseInt(s);
		System.out.println("Integer = " + parseInt);
		
		throw new MyException("Yes");
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		add();
	}
}
