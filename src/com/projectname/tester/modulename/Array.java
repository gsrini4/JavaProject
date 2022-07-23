package com.projectname.tester.modulename;

public class Array {

	public static void main(String[] args) {
		
		//Datatype[] objName = new Datatype[Length];
		
		int[] a = new int[10];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;
		a[10]= 110;
		
		System.out.println("memory address = "+a);
		System.out.println(a[3]);
		
		int length = a.length;
		System.out.println("Length = "+length);
		
		//for(initialisation; condition; increment or decrement){
	//}
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			/*
			 * if (a[i] == 50) { System.out.println("Mission completed = "+a[i]); }
			 */
			
		}
		
	}
}
