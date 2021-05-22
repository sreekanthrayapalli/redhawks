package com.redhawks.corejavaproject.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {

		//List obj = new ArrayList();
		
		//Set obj = new LinkedHashSet();
		SortedSet obj = new TreeSet();
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println(obj);//10 20 10 20 30 
		
		
		List obj2 = new ArrayList();
		obj2.add(21);
		obj2.add(22);
		obj2.add(23);
		
		obj.addAll(obj2);//obj2 data is added to obj
		System.out.println(obj);
		
		System.out.println("num of elements in Collection "+obj.size());
		
		//obj.remove(new Integer(21));//obj.remove(21)
		//obj.remove("abc");
		System.out.println(obj);
		
		//obj.clear();
		System.out.println(obj);
		
		for(Object i: obj) {
			System.out.println(i);
		}
		
		System.out.println("Using Iterations...");
		Iterator ite = obj.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println(obj.contains(10));
		System.out.println(obj.containsAll(obj2));
		System.out.println(obj.isEmpty());
	}

}
