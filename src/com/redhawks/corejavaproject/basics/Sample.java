package com.redhawks.corejavaproject.basics;

public final  class Sample {

	public Sample() {
		System.out.println("it is default constructor");
	}
	
	public Sample(int a) {
		this();
		System.out.println("it is single parameter constructor "+a);
	}
	
	public Sample(int a,int b) {
		//this(a);
		System.out.println("it is two parameterized constructor "+a+"  "+b);
	}
	
	
	//Sample s = new Sample(10);
	
	public Sample(int a,int b, int c) {
		this();
		System.out.println("this 3 paramters");
	}
	
	public int m1() {
		System.out.println("this is m1 method");//does not return 
		return 0;
	}
	
	public int m2(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public void m3(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
}
