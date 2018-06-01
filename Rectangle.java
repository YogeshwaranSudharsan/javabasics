package com.basic;

public class Rectangle {
	double length,breadth;
	public Rectangle(double length,double breadth) {
		if(length>0 && length<20 && breadth>0 && breadth<20) {
		this.length=length;
		this.breadth=breadth;
	}
		else
		{
			System.out.println("sorry length should be in limit");
		}}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*length+breadth;
	}
public static void main(String[] args) {
	Rectangle rectangle=new Rectangle(22.0,12.2);
	System.out.println(rectangle.area());
	System.out.println(rectangle.perimeter());
}
}
