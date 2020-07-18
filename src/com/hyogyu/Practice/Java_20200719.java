package com.hyogyu.Practice;

public class Java_20200719 {

	public static void main(String[] args) {
		int a = 50;
		int b = 10;
		System.out.println("a + b = " + addition(a, b)); // 60
		System.out.println("a - b = " + subtraction(a, b)); // 40
		System.out.println("a * b = " + multiplication(a, b)); // 500
		System.out.println("a / b = " + division(a, b)); // 5
	}
	
	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;
	}
	
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		return a / b;
	}
	
}
