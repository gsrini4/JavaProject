package com.projectname.tester.modulename;

public class StringTypes {

	public static void main(String[] args) {
		
		// Mutable String:
		//- If we have original and duplicate value, it will store in different memory
		//- After append. it will share the memory.
		
		StringBuilder sb = new StringBuilder("Garuda");
		StringBuilder sb1 = new StringBuilder("Garuda");
		StringBuilder sb2 = new StringBuilder("Technologies");
		
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		sb = sb.append(sb1);
		System.out.println(sb.hashCode());
		
		
		
		
	}
}
