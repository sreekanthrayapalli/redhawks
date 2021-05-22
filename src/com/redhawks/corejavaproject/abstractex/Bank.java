package com.redhawks.corejavaproject.abstractex;

public abstract class Bank {

	abstract void deposit();
	abstract void withdraw();
	
	void displayBalanace() {
		System.out.println("some balanace amount is ");
	}
}
