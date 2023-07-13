package com.example.demo;

public class X {
	public static void main(String[] args) {
		Y.m1();
	}
}
class Y {
	static void m1() {
		{
			System.out.println("1");
		}
		
		{
			System.out.println("2");
			{
				System.out.println("3");
			}
		}
	}
}
