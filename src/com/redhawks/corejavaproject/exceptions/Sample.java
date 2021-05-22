package com.redhawks.corejavaproject.exceptions;

import java.io.FileInputStream;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give two values");
		
		try {
			String input1 = sc.next();
			String input2 = sc.next();
			int a = Integer.parseInt(input1);
			int b = Integer.parseInt(input2);
			int c = a / b;
			System.out.println(c);
			
		} 
		catch (ArithmeticException ae) {
			System.out.println("donot give zero for b value");
		}catch(NumberFormatException n) {
			System.out.println("donot give characters..give only numbers");
		}finally {
			System.out.println("finally block");
		}
	}

}
