package com.solid.principal.o;

public class Traingle implements Shape {
     
	private double a,b,c;
	@Override
	public double findArea() {
		double s1=0.0,area=0.0;
		
		// TODO Auto-generated method stub
		double s =a+b+c/3;
		s1= s*(s - a)*(s -b)*(s -c);
		area = Math.sqrt(s1);
		return area;
	}

}
