package com.example.assignment3;

interface Authorize{
	boolean validUser(String user,String password);
}

public class Authentication {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		String s3 = "demouser";
		String s4 = "password";
		
		Authorize a =(x,y)->{
			if((x.isEmpty()&& y.isBlank())&&y.length()<4)				
				return false;
			else
				return true;
		};
		
		System.out.println(a.validUser(s1, s2));
		System.out.println(a.validUser(s3, s4));
	}
}
