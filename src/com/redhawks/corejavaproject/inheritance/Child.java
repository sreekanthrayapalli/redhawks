package com.redhawks.corejavaproject.inheritance;

public class Child extends Parent {

	Child(){
		System.out.println("Default Child Constrctor");
	}
	
	Child(int a){
		super(a);
		System.out.println("Parameter Child Constructor");
	}
}
