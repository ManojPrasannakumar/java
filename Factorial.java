package com.example.assignment3;
interface Fact{
	int getFactorial(int a);
}
public class Factorial {
	int x;
	
	public int multiply(int a) {
		if(a==0)
			return 1;
		else
			return (a*multiply(a-1));
	}
	
	public static void main(String[] args) {
		int x=5;
		Factorial t = new Factorial();
		Fact num = t::multiply;
		System.out.println(num.getFactorial(x));
	}
}
