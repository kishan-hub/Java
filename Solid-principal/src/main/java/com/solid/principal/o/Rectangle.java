package com.solid.principal.o;

public class Rectangle implements Shape {
	
	private double length;
	
	private double breath;

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return (length * breath);
	}

}
