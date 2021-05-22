package com.redhawks.corejavaproject.exceptions;

public class Operation {
    //p1
	public static void div(String []arg) throws ArrayIndexOutOfBoundsException,NumberFormatException,ArithmeticException {
		if(arg.length < 3) {
			ArrayIndexOutOfBoundsException are = new ArrayIndexOutOfBoundsException();
			throw are;
		}
		
		int input1 = Integer.parseInt(arg[0]);
		int input2 = Integer.parseInt(arg[1]);
		
		if(input2 < 0) {
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}
		
		
		int result = input1/input2;
		System.out.println(result);
	}
	
	
	public static void checkUser(String username, String password) throws LoginException {
		if(username.equals("admin") && password.equals("admin123")) {
			System.out.println("Welcome User");
		}else {
			LoginException le = new LoginException("Invalid User");
			throw le;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
