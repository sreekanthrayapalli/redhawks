package com.redhawks.corejavaproject.stringex;

public class Sample {

	public static void main(String[] args) {
		String s = "ABc";
		System.out.println(s.charAt(2));
		
		System.out.println(s.length());
		
		System.out.println(s.equalsIgnoreCase("abc"));
		
		String s2 = s.concat("xyz");
		s2 = s2.concat("abc2");
		s2 = s+"xyz"+"abc2";//correct 
		System.out.println(s2);
		
		
		System.out.println(s.startsWith("AB"));
		System.out.println(s.endsWith("Bc"));
		s = "A";
		s = "b";//String is Immutable
	}

}
