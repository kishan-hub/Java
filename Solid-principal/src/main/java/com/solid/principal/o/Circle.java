package com.solid.principal.o;

public class Circle implements Shape {
	
	private double radius;

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		double PI=3.14;
		return PI * radius * radius;
	}

}
