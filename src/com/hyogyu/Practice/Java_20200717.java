package com.hyogyu.Practice;

public class Java_20200717 {

	public static void main(String[] args) {
		// ���
		System.out.println("Hello world!");

		// �⺻��
		char c = 'A';
		byte b = 0;
		short s = 1;
		int i = 2;
		long l = 3L;
		float f = 4f;
		double d = 5d;
		boolean bool = true;

		// ���� | 2 Byte | 0 ~ 65,635
		// ���� | 1 Byte | -128 ~ 127
		// ���� | 2 Byte | -32,768 ~ 32,767
		// ���� | 4 Byte | -2,147,483,648 ~ 2,147,283,647
		// ���� | 8 Byte | -2^64 ~ 2^64 - 1
		// �Ǽ� | 4 Byte | 32 Bit �Ǽ�
		// �Ǽ� | 8 Byte | 64 Bit �Ǽ�
		// �Ҹ� | 1 Byte | True / False

		System.out.println("char : " + c + "\nbyte : " + b + "\nshort : " + s + "\nint : " + i + "\nlong : " + l
				+ "\nfloat : " + f + "\ndouble : " + d + "\nboolean : " + bool);

		// ������
		int i1 = 0;
		int i2 = +10;
		int i3 = -10;

		System.out.println(i1 + " / " + i2 + " / " + i3); // 0 | 10 | -10

		int i4 = ++i1;
		System.out.println(i4 + " / " + i1); // 1 | 1
		int i5 = i1++;
		System.out.println(i5 + " / " + i1); // 1 | 2

		int x = 10;
		int y = 5;
		System.out.println((x + y) + " / " + (x - y) + " / " + (x * y) + " / " + (x / y) + " / " + (x % y)); // 15 | 5 | 50 | 2 | 0
	}
}
