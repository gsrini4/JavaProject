package com.projectname.tester.modulename;

public class Bank extends BankDetails{

	@Override
	public void hdfc() {
		System.out.println("HDFC BANK");
	}
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.hdfc();
		b.sbi();
	}

}
