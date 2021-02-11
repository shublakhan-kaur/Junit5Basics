package com.shub.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class StringHelperParameterTest {

	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;

	public StringHelperParameterTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testCondition() {
		String expectedOutputs[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
//		StringHelper helper = new StringHelper();
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
//		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

	}
}
