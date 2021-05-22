package com.redhawks.corejavaproject.collections;

public class Employee implements Comparable<Employee>{

	private int empno;
	private String ename;
	public Employee() {
		
	}
	public Employee(int empno,String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public int hashCode() {
		return empno*123;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(emp.getEmpno()==this.empno && emp.getEname().equals(this.getEname())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.empno-o.getEmpno();
	}
}
