package com.redhawks.corejavaproject.basics;

import java.util.Scanner;

public class SampleArray2 {

	public static void main(String[] args) {
		int a[] = new int[10];
		System.out.println("enter values");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("entered values");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
