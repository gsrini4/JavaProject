package com.projectname.tester.modulename;

public class MethodOverloading {
	
	public void empDetails() {

		System.out.println("Employee company name = TCS");
	}
	
	public void empDetails(String name) {

		System.out.println("Employee name = "+name);
	}
	
	public void empDetails(String fullName, char initial) {

		System.out.println("Employee full name = "+fullName+". "+initial);
	}
	
	public void empDetails(int id, String salary, int phNum) {

		System.out.println("Employee id= "+ id + "; Salary = " + salary + "; phNum = "+phNum);
	}
	
	public static void main(String[] args) {
		
		
		//ClassName objName = new ClassName();
		
		MethodOverloading mo = new MethodOverloading();
		mo.empDetails();
		mo.empDetails("Arun");
		mo.empDetails("Arun Rohit", 'R');
		mo.empDetails(123, "12LPA", 987654);
		
	}
	

}
