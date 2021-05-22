package com.redhawks.corejavaproject.abstractex;

public class BankEx {

	public static void main(String[] args) {
		
		Bank obj ;
		
		obj = new JPMC();
		obj.deposit();
		obj.withdraw();
		
		
		obj = new BOFA();
		obj.deposit();
		obj.withdraw();
	}

}
