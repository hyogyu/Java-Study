package com.hyogyu.Practice;

public class Java_20200717 {

	public static void main(String[] args) {
		// 출력
		System.out.println("Hello world!");

		// 기본형
		char c = 'A';
		byte b = 0;
		short s = 1;
		int i = 2;
		long l = 3L;
		float f = 4f;
		double d = 5d;
		boolean bool = true;

		// 문자 | 2 Byte | 0 ~ 65,635
		// 정수 | 1 Byte | -128 ~ 127
		// 정수 | 2 Byte | -32,768 ~ 32,767
		// 정수 | 4 Byte | -2,147,483,648 ~ 2,147,283,647
		// 정수 | 8 Byte | -2^64 ~ 2^64 - 1
		// 실수 | 4 Byte | 32 Bit 실수
		// 실수 | 8 Byte | 64 Bit 실수
		// 불린 | 1 Byte | True / False
		
		System.out.println("char : " + c + "\nbyte : " + b + "\nshort : " + s + "\nint : " + i + "\nlong : " + l
				+ "\nfloat : " + f + "\ndouble : " + d + "\nboolean : " + bool);
	}
}
