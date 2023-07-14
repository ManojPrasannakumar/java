package com.example.assignment3;
interface DemoInter{
	void space(String s);
}
public class LambdaDemo {
	public static void main(String[] args) {

		String a="hello";
		DemoInter d =(x)->{
			char[] s = a.toCharArray();
			for (int i = 0; i < a.length(); i++) {
	            System.out.print(s[i]+" ");
	        }}; 
		d.space(a);
	}
}