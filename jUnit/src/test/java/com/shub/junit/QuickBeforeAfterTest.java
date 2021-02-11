package com.shub.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuickBeforeAfterTest {

	@BeforeEach
	public void setup() {
		System.out.println("Before test");
	}

	@Test
	void test1() {
		System.out.println("Test executed");
	}

	@Test
	void test2() {
		System.out.println("Test 2 executed");
	}

}
