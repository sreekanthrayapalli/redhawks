package com.redhawks.corejavaproject.basics;

public class SampleExecution {

	public static void main(String[] args) {

		Sample s1 = new Sample(10,20,30);
		
		
		int r1=s1.m2(10, 20);//30
		int r2 = s1.m2(30, 40);//70
		s1.m3(10, 20);
	}
	

}
