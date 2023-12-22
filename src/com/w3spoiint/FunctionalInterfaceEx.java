package com.w3spoiint;

public class FunctionalInterfaceEx implements AddInterface {
	
	public void add(int a,int b) {
	System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceEx a1 = new FunctionalInterfaceEx();
		a1.add(10, 20);
	}

}
