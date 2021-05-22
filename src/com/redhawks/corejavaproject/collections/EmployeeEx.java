package com.redhawks.corejavaproject.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeEx {

	public static void main(String[] args) {
		//List<Employee> obj = new ArrayList<>();
		SortedSet<Employee> obj = new TreeSet<Employee>();
		obj.add(new Employee(10,"abc"));
		obj.add(new Employee(2,"xyz"));
		obj.add(new Employee(13,"pqr"));
		obj.add(new Employee(1,"abc"));
		obj.add(new Employee(12,"xyz"));
		System.out.println(obj.size());
		
		for(Employee e:obj) {
			System.out.println(e.getEmpno()+"   "+e.getEname());
		}
		
		
		
		
		
	}

}
