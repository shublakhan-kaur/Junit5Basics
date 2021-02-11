package com.shub.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringHelperTest {

	StringHelper helper;

	@BeforeEach
	public void setup() {
		helper = new StringHelper();
		System.out.println("Before test");
	}

	@BeforeAll
	static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterAll
	static void afterClass() {
		System.out.println("After Class");
	}

	@AfterEach
	void tearDown() {
		System.out.println("Tear Down");
	}

	@Test
	void testTruncateAInFirst2Positions() {
//		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

//	ABCD->false ABAB ->true ,AB-> true A->false
	@Test
	void testAreFirstLastPositionSame_BasicNegative() {
//		StringHelper helper = new StringHelper();
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	void testAreFirstLastPositionSame_BasicPositive() {
//		sStringHelper helper = new StringHelper();
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}