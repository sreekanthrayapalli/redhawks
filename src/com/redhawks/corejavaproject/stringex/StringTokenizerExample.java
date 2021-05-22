package com.redhawks.corejavaproject.stringex;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hi*hello*how are you* i am fine, thank you";
		
		StringTokenizer st = new StringTokenizer(s,"*");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		
		String []sa = s.split("*");
		for(int i=0;i<sa.length;i++) {
			System.out.println(sa[i]);
		}
	}

}
