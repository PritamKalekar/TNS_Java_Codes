package com.abstraction;

public class Rectangle extends Shape{
	
	private float width,height;
	
	
	public Rectangle() {

		this.width=4.0f;
		this.height=10.0f;
	}


	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	void calArea() {
		area = width*height;
	}

}
