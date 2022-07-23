package com.projectname.tester.modulename;

import java.util.Scanner;

public class ScannerClass {

	public void scanner() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Input = Employee Details");
		
		String nextLine = scan.nextLine();
		System.out.println("Employee Full name = " + nextLine);
		
		int nextInt = scan.nextInt();
		System.out.println("Employee Id = "+nextInt);
		
		String next = scan.next();
		System.out.println("Employee name = "+next);
		

	}

	public static void main(String[] args) {

		ScannerClass sc = new ScannerClass();
		sc.scanner();
	}

}
