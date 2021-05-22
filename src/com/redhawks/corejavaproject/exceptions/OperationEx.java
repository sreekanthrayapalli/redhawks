package com.redhawks.corejavaproject.exceptions;

public class OperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//p2
		String arr[] = {"10","-1"};
		try {
		Operation.div(arr);
		}catch(ArithmeticException ae) {
			System.out.println("user donot give zero or -ve for second value");
		}catch(ArrayIndexOutOfBoundsException are) {
			System.out.println("user.. plz pass two values.");
		}catch(NumberFormatException ne) {
			System.out.println("user.. plz give only numbers");
		}
	}

}
