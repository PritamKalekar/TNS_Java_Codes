package com.abstraction;

public class Square extends Shape{

	private float side;

	public Square() {
		this.side=2.0f;
	}

	public Square(float side) {
		super();
		this.side = side;
	}
	
	void calArea() {
		super.area=side*side;
	}
}
