package com.projectname.tester.modulename;

public class EmployeeDetails {

	public void empName(String name) {

		System.out.println("Employee Name = " + name);
	}

	public void empName(int name) {

		System.out.println("Employee Name = " + name);
	}

	public void phNumber(long phNum) {
		System.out.println("Employee phn number = " + phNum);
	}

	public void empId(int id) {
		System.out.println("Employee id = " + id);
	}

	private void empSalary(String salary) {
		System.out.println("Employee salary = " + salary);
	}

	public static void main(String[] args) {

		// ClassName objName = new ClassName();

		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.empName("Vicky");
		empDetails.phNumber(6789878);
		empDetails.empId(123);
		empDetails.empSalary("11LPA");
	}
}
