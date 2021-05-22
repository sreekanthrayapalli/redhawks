package com.redhawks.corejavaproject.exceptions;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values");
		String username = sc.next();
		String password = sc.next();
		try {
			Operation.checkUser(username, password);
		} catch (LoginException e) {
		//	e.printStackTrace();//line number,information about exception
			System.out.println(e.getMessage());
			System.out.println("plz enter valid username and password");
		}

	}

}
