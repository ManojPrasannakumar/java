package com.example.demo;

import java.util.Scanner;

class Shape{
	private String shapename;
	
	Shape(String shapename){
		this.shapename = shapename;
	}
	
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Square extends Shape{

	private Integer side;
	
	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	Square(String square) {
		super(square);
	}

	@Override
	public double calculateArea() {
		System.out.println("Area of Square");
		return side*side;
	}	
}

class Rectangle extends Shape{

	private Integer length;
	private Integer breadth;
	
	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getBreadth() {
		return breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}

	Rectangle(String rectangle) {
		super(rectangle);
	}

	@Override
	public double calculateArea() {
		System.out.println("Area of Rectangle");
		return length*breadth;
	}	
}

class Circle extends Shape{

	private Integer radius;
	
	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	Circle(String circle) {
		super(circle);
	}

	@Override
	public double calculateArea() {
		System.out.println("Area of Circle");
		return 3.142*radius*radius;
	}	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle("rectangle");
		Square sq = new Square("square");
		Circle c = new Circle("circle");
		
		System.out.println("Enter the ShapeType Number");
		System.out.println("1.Rectangle");
		System.out.println("2.Square");
		System.out.println("3.Circle");
		
		int num = Integer.parseInt(sc.nextLine());
		
		if(num==1){
			System.out.println("Enter Length and Breadth:");
			rect.setLength(Integer.parseInt(sc.nextLine()));
			rect.setBreadth(Integer.parseInt(sc.nextLine()));
			System.out.println(rect.calculateArea());
		}
		
		if(num==2){
			System.out.println("Enter side:");
			sq.setSide(Integer.parseInt(sc.nextLine()));
			System.out.println(sq.calculateArea());
		}
		
		if(num==3){
			System.out.println("Enter radius:");
			c.setRadius(Integer.parseInt(sc.nextLine()));
			System.out.println(c.calculateArea());
		}
		
	}

}
