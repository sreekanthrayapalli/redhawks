package com.redhawks.corejavaproject.inheritance;

public class C2 extends C1{
	
	int a = 11;

	//m1 method already defined in Parent, we are overriding m1
	void m1() {
		System.out.println("this is m1 from C2");
	}
	
	
	//Method overloading
	void m2() {
		int a = 12;//local variable
		m1();//here first it checks child class, not it is not defined then it calls from Parent
		super.m1();//this time it calls from Parent class only
		System.out.println(a);//12
		System.out.println(this.a);//11 non-static 
		System.out.println(super.a);//10
	}
}
