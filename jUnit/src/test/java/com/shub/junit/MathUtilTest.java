package com.shub.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

@DisplayName("When running MathUtil")
class MathUtilTest {

	MathUtil mathUtils;
	TestInfo testInfo;
	TestReporter testReporter;

	@BeforeAll
	static void beforeAllInit() {

//		System.out.println("This needs to be run before all");
	}

	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mathUtils = new MathUtil();
		testReporter.publishEntry("Running " + testInfo.getDisplayName());
	}

	@AfterEach
	void cleanUp() {
//		System.out.println("Cleaning up..");
	}

	@AfterAll
	static void afterAllCleanUp() {
//		System.out.println("Cleaning up after all");
	}

	@Nested
	@DisplayName("Add method")
	class addTest {
		@Test
		@DisplayName("when adding two positive numbers")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1), "The add method should add two numbers");
		}

		@Test
		@DisplayName("when adding two negative numbers")
		void testAddNegative() {
			assertEquals(-2, mathUtils.add(-1, -1), "The add method should add two numbers");
		}
	}

//	@RepeatedTest(3)
	@Test
	@DisplayName("Computer circle radius")
	void testComputeCircleRaduis() {
//		System.out.println(testInfo.getDisplayName());
//		if (repetitionInfo.getCurrentRepetition() == 1) {
		assertEquals(314.1592653589793, mathUtils.computerCircleArea(10), "Should return right circle area");
//		}
	}

	@Test
	@Disabled
	@DisplayName("Disabled Method")
	void testDisable() {
		assumeTrue(true);
		fail("This is disabled Method");
	}

	@Test
	@DisplayName("Throws error")
//	@Disabled
//	@EnabledOnOs(OS.LINUX)
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}

	@Test
	@DisplayName("Multiply method")
	void testMultiply() {

		assertAll(() -> assertEquals(4, mathUtils.multiply(2, 2)), () -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1)));

	}

}
