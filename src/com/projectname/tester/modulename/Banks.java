package com.projectname.tester.modulename;

public class Banks implements BankDetail{

	
	@Override
	public void sbi() {
		System.out.println("SBI BANK");
	}
	
	public static void main(String[] args) {
		
		Banks b = new Banks();
		b.hdfc();
		b.sbi();
	}

	@Override
	public void hdfc() {
		// TODO Auto-generated method stub
		
	}

}
