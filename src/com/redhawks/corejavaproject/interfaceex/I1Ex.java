package com.redhawks.corejavaproject.interfaceex;

public class I1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//I1 obj = new I1();//error
		
		I1 obj = new C1();//
		obj.m1();
		obj.m2();
		//obj.m3();
		
		I2 obj2 = new C1();
		obj2.m3();
		
		C1 c1Obj = new C1();
		c1Obj.m1();
		c1Obj.m2();
		c1Obj.m3();
		

	}

}
