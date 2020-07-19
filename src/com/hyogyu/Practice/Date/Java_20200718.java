package com.hyogyu.Practice.Date;

import java.util.stream.Stream;

public class Java_20200718 {

	public static void main(String[] args) {

		// 반복문
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		Stream.of("a1", "a2", "b1", "c3", "c2", "c1").filter(i -> i.contains("c")).map(s -> s.substring(1))
				.mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
	}
}
