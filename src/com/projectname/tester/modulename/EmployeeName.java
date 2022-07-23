package com.projectname.tester.modulename;

//Child Class
public class EmployeeName extends MethodOverriding{
	
	@Override // ---> Annotation
	public void empName(String name) {
		super.empName("Arun");
		System.out.println("Employee name = "+name);
	}
	
	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();
		
		MethodOverriding empName = new EmployeeName(); //UPCASTING
		empName.empName("Naveen");
	}

}
