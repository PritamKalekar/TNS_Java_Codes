package com.abstraction;

public class AbstractDemo {

	public static void main(String[]args) {
		
		Square sq = new Square();
		Rectangle r = new Rectangle();
		
		sq.calArea();
		sq.show();
		
		r.calArea();
		r.show();
		
		Shape s = new Square();
		
		s.calArea();
	}
}
