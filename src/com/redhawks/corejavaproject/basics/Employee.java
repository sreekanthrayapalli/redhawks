package com.redhawks.corejavaproject.basics;

//Business Logic
public class Employee {

	int empno;
	String ename;
	int sal;
	static String officeName;
	
	void displayEmployeeInfo() {
		System.out.println(empno+"   "+ename+"  "+sal);
	}
	
	
	 Employee(){// Default Constructor
		empno = 101;
		ename = "abc";
		sal = 3000;
	}
	
	Employee(int empno,String ename){
		this.empno = empno;
		this.ename = ename;//10
		System.out.println(this.empno);
	}
	 
	Employee(int empno, String ename, int sal){// Parameterized Constructor
		//10 + 4-->/2+1
		/*
		 * this.empno = empno; this.ename = ename;
		 */
		this(empno,ename);//it is calling parameterized constructor Employee(empno,ename)
		//this();//calling default constructor
		try {
			this.sal = sal;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
