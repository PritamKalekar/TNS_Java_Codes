package com.daythree.ScannerClass;

public class MethodsDemo {
	//non-parameterized methods
	public void addition()
	{
		int x=20;//local variable
		int y=10;
		int add=x+y;
		System.out.println("Addition of X and Y ="+add);
	}
	
	//parameterized method
	
	public void multiply(int a,int b)
	{
		int mult=a*b;
		System.out.println("multiplication of a and b ="+mult);
	}
	
	public static void main(String[]args) {
		
		MethodsDemo obj1 = new MethodsDemo();
		obj1.addition();
		obj1.multiply(90, 10);
	}

}
