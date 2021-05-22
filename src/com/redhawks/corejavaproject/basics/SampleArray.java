package com.redhawks.corejavaproject.basics;

public class SampleArray {

	public static void main(String[] args) {
		int []a = new int[5];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
		
		
		System.out.println(a[0]+"  "+a[1]+" "+a[2]+"  "+a[3]);
		
		System.out.println("using loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
