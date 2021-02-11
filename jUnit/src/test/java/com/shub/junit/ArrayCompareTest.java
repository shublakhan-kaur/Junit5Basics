package com.shub.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayCompareTest {

	@Test
	void test() {
		int[] numbers = { 12, 3, 4 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test
	void testException() {

	}

}
