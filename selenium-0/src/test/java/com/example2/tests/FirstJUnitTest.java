package com.example2.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstJUnitTest {

	@Test
	public void test_basic() {
		SimpleClass simpleClass = new SimpleClass();
		int result = simpleClass.sumMethod(new int[] {12,15,18});
		assertEquals(45, result);
	}

}

class SimpleClass {
	public int sumMethod(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}
