package com.redhawks.corejavaproject.basics;

public class DisplayHello {
	
	
	//Execution logic class
	public static  void main(String[] args) {
		
		Employee emp = new Employee();//Created object with default Constructor
		emp.empno = 1000;
		emp.ename = "abc";
		emp.sal = 5000;
		emp.displayEmployeeInfo();
		
		Employee.officeName="Redhawks Solutions";
		
		Employee emp1 = new Employee();
		emp1.empno = 1001;
		emp1.ename = "xyz";
		emp1.sal = 6000;
		emp1.displayEmployeeInfo();
		
		
		Employee emp2 = new Employee(1002,"pqr",7000);//paramerized constructor
		emp2.sal = 7500;
		emp2.displayEmployeeInfo();
		
		
		
		Employee emp3 = new Employee(1003,"xyz");
	}

}
