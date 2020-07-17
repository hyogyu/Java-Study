package com.hyogyu.Practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("1이 맞음");
			break;
		default:
			System.out.println("1이 아님");
		}
	}

}
