package com.redhawks.corejavaproject.stringex;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length()+"   "+sb.capacity());
		sb.append("abc");
		sb.append("xyz");
		System.out.println(sb);
		
		sb.insert(4, "ok");
		System.out.println(sb);
		
		sb.replace(4, 6, "ye");
		System.out.println(sb);
		String s= new String(sb);//StringBuffer to String object
		
	}

}
